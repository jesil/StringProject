package com.string;

import java.util.Map;

import com.exceptions.IllegalStringException;

public class StringLogics{
	public static boolean isPalindrome(String string) {
		return Palindrome.isPalindrome(string);
	}
	public static String reverse(String string) {
		return Reverse.reverse(string);
	}
	public static Map<String, Integer> letterCount(String stringExample1) throws IllegalStringException {
		// TODO Auto-generated method stub
		return LetterCount.letterCount(stringExample1);
	}
	public static boolean verify(String string) {
		return Verify.verify(string);
	}
	
}
