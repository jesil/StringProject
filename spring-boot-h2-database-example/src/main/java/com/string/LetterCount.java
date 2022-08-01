package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import com.exceptions.IllegalStringException;


public interface LetterCount {
	public static Map<String,Integer> letterCount(String string) throws IllegalStringException {
		
		Map<String,Integer> countMap = new HashMap<String,Integer>();
		
		if(!StringLogics.verify(string)) {
			throw new IllegalStringException(string);
		}else {
			Stream.of(string.split("")).distinct().forEach(n->{
				countMap.put(n,0);
			});
			Stream.of(string.split("")).forEach(k->{
				countMap.forEach((key,value)->{
				if(key.equals(k))
					countMap.replace(k, value+1);
				});
					
			});
			countMap.forEach((key,value) -> System.out.println("Key : "+ key + ", Value : " + value));
			return countMap;
		}
		
		
		
	}
}
