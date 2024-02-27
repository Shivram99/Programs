package com.mahait.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringMap {
	
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		asList.stream().map(e -> e * 10).forEach(System.out::println);
		
		List<String> collect = asList.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println(collect);
	}
}
