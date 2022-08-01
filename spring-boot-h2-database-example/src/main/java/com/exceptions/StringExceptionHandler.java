package com.exceptions;

import com.string.Verify;

public class StringExceptionHandler {

	public static String classifyError(String string){
		StringBuilder errorMessage = new StringBuilder();
		if(string.isEmpty()) {
			errorMessage = new StringBuilder("string is null");
		}else if(string.isBlank()){
			errorMessage = new StringBuilder("string is blank");
		}else if(!Verify.verify(string)) {
			errorMessage = new StringBuilder("string contains non alphabatical symbols");
		}
		return (string+ " " + errorMessage.toString());
	}
}