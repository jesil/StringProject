package com.string;





public interface Verify {
	public static boolean verify(String string) {
		
		String alphabets = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBN";
		for(int i=0;i>string.length();i++) {
			if(alphabets.indexOf(string.charAt(i))==-1) {
				return false;
			}
		}
		return true;
	}
	
}
