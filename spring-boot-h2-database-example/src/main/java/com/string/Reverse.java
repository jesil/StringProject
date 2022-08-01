package com.string;

public interface Reverse {
	
	
	public static String reverse(String string) {
		
		//forEach(char ch: string.toCharArray()){}
		
		StringBuilder reverse = new StringBuilder();
		for(int i=string.length()-1;i>=0;i-- ) {
			reverse = reverse.append(string.charAt(i));
		}
		
		
		
		return reverse.toString();
	}
}
