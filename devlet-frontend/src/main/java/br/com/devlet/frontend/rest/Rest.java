package br.com.devlet.frontend.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Rest {
	private static final String baseUrl = "http://localhost:8080";
	//private static final String baseUrl = "";
	private static List<Request> requests = new ArrayList<Request>();

	private static Integer countCurrentRequest = 0;
	public static void addToQueue(Request request) {
		requests.add(request);
		run();
	}

	public static void run() {
		if (requests.size() > 0) {
			if(countCurrentRequest <5) {
				Integer numberRequest = 5 - countCurrentRequest;
				if(requests.size() < numberRequest) {
					numberRequest = requests.size();
				}
				
				for (int i = 0; i < numberRequest; i++) {
					Request request = requests.get(i);
					requests.remove(i);
					countCurrentRequest ++;
					new Thread(() ->{
						handleRequest(request);
					}).start();
				}				
			}
		}
	}

	private static void handleRequest(Request request) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setErrorHandler( new ResponseErrorHandler() {	
			@Override
			public boolean hasError(ClientHttpResponse response) throws IOException {
				return false;
			}
			
			@Override
			public void handleError(ClientHttpResponse response) throws IOException {
			}
		});
		String url = baseUrl + request.getUrl();
		try {
			HttpEntity<String> entity = getHttpEntity(request);
			ResponseEntity<String> responseEntity = restTemplate.exchange(url, request.getMethod(), entity, String.class);
			handleResponse(request, responseEntity);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private static HttpEntity<String> getHttpEntity(Request request) throws JsonProcessingException {
		if (request.getBody() != null && request.getHeaders() != null) {
			return new HttpEntity<String>(bodyToJson(request.getBody()), request.getHeaders());
		} else if (request.getBody() != null) {
			return new HttpEntity<String>(bodyToJson(request.getBody()));
		} else if (request.getHeaders() != null) {
			return new HttpEntity<String>(request.getHeaders());
		}
		return null;
	}

	private static String bodyToJson(Object body) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(body);
	}
	
	private static void handleResponse(Request request,ResponseEntity<String> responseEntity) throws JsonMappingException, JsonProcessingException {
		RestEvent event = null;
		Response response = new Response();
		response.status = responseEntity.getStatusCode();
		response.headers = responseEntity.getHeaders();
		if (responseEntity.getStatusCode().is2xxSuccessful()) {
			event = request.getOnSuccess();
			if(responseEntity.hasBody()) {
				response.body = new ObjectMapper().readValue(responseEntity.getBody(),request.getResponseType());					
			}
		} else if (responseEntity.getStatusCode().is4xxClientError()
				|| responseEntity.getStatusCode().is5xxServerError()) {
			response.body = responseEntity.getBody();
			event = request.getOnError();
		}
		event.handle(response);
		countCurrentRequest --;
		if(requests.size()>0) {
			run();
		}
	}

}
