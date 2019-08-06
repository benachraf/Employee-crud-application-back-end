package com.ach.employe.exceptions;

import org.springframework.http.HttpStatus;

public class ErrorDetails {

	private String messsage;
	private HttpStatus httpStatus;
	public ErrorDetails(String messsage, HttpStatus httpStatus) {
		super();
		this.messsage = messsage;
		this.httpStatus = httpStatus;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
}
