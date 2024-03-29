package com.mahait.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
	
	public static void main(String[] args) {
		
		  List<List<String>> flatMapList = Arrays.asList(
				  Arrays.asList("1","2","3"),
				  Arrays.asList("4","5","6"),
				  Arrays.asList("7","8","9"));
		 
		  List<String> collect = flatMapList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		 
		  System.out.println(collect);
	}

}
