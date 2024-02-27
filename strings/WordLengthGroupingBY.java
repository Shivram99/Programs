package com.mahait.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthGroupingBY {
	public static void main(String[] args) {
		
			List<String> asList = Arrays.asList("i","am","a","Coder","I","AM","A","Programmer","Coder");
			
			Map<Integer, List<String>> wordLengthGroupingBY = asList.stream().collect(Collectors.groupingBy(String::length));
			System.out.println(wordLengthGroupingBY);
		}
}
