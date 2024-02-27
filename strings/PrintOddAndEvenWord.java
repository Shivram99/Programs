package com.mahait.strings;

public class PrintOddAndEvenWord {
	
	public static void main(String[] args) {
		String str = "Java is a platform independent language";
		
		System.out.println("== Even Word is ==");
		printEvenWord(str);
		
		System.out.println();
		
		System.out.println("== Odd Word is ==");
		printOddWord(str);
	}

	private static String printEvenWord(String str) {
		for(String odd : str.split(" ")) {
			if(odd.length() % 2 == 0) {
				System.out.println("\t"+odd);
			}
		}
		return str;
	}

	private static String printOddWord(String str) {
		for(String odd : str.split(" ")) {
			if(odd.length()%2!=0) {
				System.out.println("\t"+odd);
			}
		}
		return str;
	}

	
}
