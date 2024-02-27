package com.mahait.strings;

public class SumOfStringValue {
	public static void main(String[] args) {
		String s1 = "abc";   
		int sum = 0;
		char[] charArray = s1.toCharArray();
		
		for (char c : charArray) {
			
			sum = sum + (c - 'a' + 1);
		}
		System.out.println(sum);
	}
}


