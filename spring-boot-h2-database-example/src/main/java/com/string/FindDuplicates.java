package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.exceptions.IllegalStringException;

public interface FindDuplicates {
	public static Set<String> findDuplicate(String string) throws IllegalStringException {
		Set<String> set = new HashSet<String>();
		Map<String,Integer> map= StringLogics.letterCount(string);
		
		map.forEach((key,value)->{
			if(value>1) {
				set.add(key);
			}
		});
		return set;
	}
}
