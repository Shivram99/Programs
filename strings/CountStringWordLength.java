package com.mahait.strings;

import java.util.Arrays;
import java.util.List;

public class CountStringWordLength {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Mahendra","Shivram","Sudhir","Shiv","Mayur","Sudip","Sachin");
		long count = asList.stream().filter(str -> str.length() > 5).count();
		System.out.println(count);
	}
}
