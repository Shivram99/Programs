package com.mahait.programs;

import java.util.Scanner;

public class StringWhiteSpaceRemove {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String with spaces : ");
		String nextLine = sc.nextLine();
		System.out.println(nextLine.replaceAll("\\s", ""));
	}
}
