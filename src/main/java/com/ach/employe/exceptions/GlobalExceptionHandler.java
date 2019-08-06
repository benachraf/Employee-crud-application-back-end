package com.ach.employe.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(RessourceNotFoundException.class)
	public ResponseEntity<?> RessourceNotFoundHandler(RessourceNotFoundException e){
		ErrorDetails errorDetails = new ErrorDetails(e.getMessage(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

}
