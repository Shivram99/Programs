package com.mahait.strings;

import java.util.Scanner;

public class ReverseWordSamePosition {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentance :");
		String str = sc.nextLine();
		
		reverseWord(str);
	}

	private static void reverseWord(String str) {
		for(String word : str.split(" ")) {
			for(int i=word.length()-1; i>=0; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
