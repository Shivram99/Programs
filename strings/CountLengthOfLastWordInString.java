package com.mahait.strings;

public class CountLengthOfLastWordInString {
	public static void main(String[] args) {
		String s1 = "Java is powerful Language";
		String[] splitString = s1.split("\\s");
		int length = splitString[splitString.length-1].length();
		
		System.out.println("Last Word is "+splitString[splitString.length-1]+ " and count is = "+length);
	}
}
