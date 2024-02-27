package com.mahait.programs;

public class StringNonRepeatedCharacter {

	public static void main(String[] args) {
		String s = "sshhiivvram";
		for (Character ch : s.toCharArray()) {
			if (s.indexOf(ch) == s.lastIndexOf(ch)) {
				System.out.println("Non-Repeat " + ch);
				break;
			}
		}
	}
}
