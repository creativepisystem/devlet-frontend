package br.com.devlet.frontend.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

public class Request {
	private String url;
	private HttpMethod method;
	private Object body;
	private HttpHeaders headers = new HttpHeaders();
	private RestEvent onSuccess;
	private RestEvent onError;
	private Class<?> responseType = String.class;
	public Request url(String url) {
		this.url = url;
		return this;
	}
	
	public Request body(Object body) {
		this.body = body;
		this.headers.setContentType(MediaType.APPLICATION_JSON);
		return this;
	}
	
	public Request header(String header,String data) {
		if(headers == null) {
			headers = new HttpHeaders();
		}
		headers.add(header, data);
		return this;
	}
	public Request headers(Map<String ,Object> headers) {
		if(headers == null) {
			headers = new HashMap<String, Object>();
		}
		headers.putAll(headers);
		return this;
	}
	
	public Request responseType(Class<?> responseType) {
		this.responseType = responseType;
		return this;
	}
	public Request get() {
		method = HttpMethod.GET;
		return this;
	}

	public Request post() {
		method = HttpMethod.POST;
		return this;
	}

	public Request delete() {
		method = HttpMethod.DELETE;
		return this;
	}

	public Request put() {
		method = HttpMethod.PUT;
		return this;
	}
	
	public void send() {
		Rest.addToQueue(this);
	}
	
	public Request onSucess(RestEvent event) {
		this.onSuccess = event;
		return this;
	}
	
	public Request onError(RestEvent event) {
		this.onError = event;
		return this;
	}

	protected String getUrl() {
		return url;
	}

	protected HttpMethod getMethod() {
		return method;
	}

	protected Object getBody() {
		return body;
	}

	protected HttpHeaders getHeaders() {
		return headers;
	}

	protected RestEvent getOnSuccess() {
		return onSuccess;
	}

	protected RestEvent getOnError() {
		return onError;
	}

	protected Class<?> getResponseType() {
		return responseType;
	}
	
}
