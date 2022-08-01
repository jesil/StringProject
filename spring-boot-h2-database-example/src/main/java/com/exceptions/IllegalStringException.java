package com.exceptions;

public class IllegalStringException extends Exception {
	public IllegalStringException(String string) {
		//super(StringEceptionHandler.classifyError(string));
		super(StringExceptionHandler.classifyError(string));
	}

}
