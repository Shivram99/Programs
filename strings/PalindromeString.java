package com.mahait.strings;

public class PalindromeString {
	public static void main(String[] args) {
		
		String firstString = "NITIN";
		String secondString = "";
		
		for (int i = firstString.length()-1; i >=0;  i--) {
			secondString = secondString + firstString.charAt(i);
		}
		if(firstString.length() == secondString.length() && firstString.equals(secondString)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
