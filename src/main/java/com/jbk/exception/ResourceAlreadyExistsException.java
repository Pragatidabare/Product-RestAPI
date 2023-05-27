package com.jbk.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

public class ResourceAlreadyExistsException extends RuntimeException{

	public ResourceAlreadyExistsException(String msg) {
		super(msg);
	}
}
