package com.mahait.strings;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s1 ="India is my country";
		/*1st Approch*/
		String replaceAll = s1.replaceAll(" ", "");
		System.out.println(replaceAll);
		
		/*2st Approch*/
		String[] split = s1.split(" ");
		for (String string : split) {
			System.out.print(string);
		}
	}

}
