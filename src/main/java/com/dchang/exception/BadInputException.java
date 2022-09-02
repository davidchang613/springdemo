package com.dchang.exception;

import org.json.JSONException;

public class BadInputException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public BadInputException(String exception) {
		super(exception);
	}

}
