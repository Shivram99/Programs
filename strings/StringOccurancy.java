package com.mahait.strings;

import java.util.Map;
import java.util.stream.Collectors;

public class StringOccurancy {
	public static void main(String[] args) {
		
		String string = "NITIN";
		
		Map<Character, Long> collect = 
				string.chars()
				.mapToObj(x->(char)x)
				.collect(Collectors.groupingBy(i -> i,Collectors.counting()));
		
		System.out.println(collect);
	}
}
