package com.main;

import java.util.Map;

import com.exceptions.IllegalStringException;
import com.string.Palindrome;
import com.string.Reverse;
import com.string.StringConstants;
import com.string.StringLogics;
import com.string.Verify;

public class MainClass {

	public static void main(String[] args) throws IllegalStringException {
		// TODO Auto-generated method stub
		StringConstants string = new StringConstants("malayalam");
		
		if(StringConstants.verify(string.getStringExample1())) {
	
			System.out.println(StringConstants.reverse(string.getStringExample1()));
			
			System.out.println(StringConstants.isPalindrome(string.getStringExample1()));
			
			Map<String,Integer> countMap = StringConstants.letterCount(string.getStringExample1());
		}else {
			
			throw new IllegalStringException("string");
			//System.out.println("illegal symbols in string");
		}
	}

}