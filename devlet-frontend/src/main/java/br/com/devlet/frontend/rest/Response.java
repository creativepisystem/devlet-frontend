package br.com.devlet.frontend.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public class Response {
	protected HttpStatus  status;
	protected Object body;
	protected HttpHeaders headers;
	
	public HttpStatus getStatus() {
		return status;
	}
	public Object getBody() {
		return body;
	}
	public HttpHeaders getHeaders() {
		return headers;
	}
}
