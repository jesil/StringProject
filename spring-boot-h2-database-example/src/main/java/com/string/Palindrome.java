package com.string;

public interface Palindrome {
	
	public static boolean isPalindrome(String string) {
		
		if(string.equals(Reverse.reverse(string))) {
			return true;
		}else {
			return false;
		}
		
	}

}
