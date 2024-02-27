package com.mahait.strings;

public class StringFirstAndLastAlphabetSameOrNotCheck {
	public static void main(String[] args) {
		
		String arr[] = {"aa","aba","pap","nitin","abc","pqr","a","ShivramS"};
		
		/*1st Approch*/
		System.out.println("=== 1st Approch ===");
		for (String string : arr) {
			if (string.charAt(0) == string.charAt(string.length() - 1)) {
				if (string.length() > 1) {
					System.out.println("\t" + string);
				}
			}
		}
		
		System.out.println("=== 2nd Approch ===");
		/*2nd Approch*/
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].charAt(0) == arr[i].charAt(arr[i].length() - 1) && arr[i].length()>1){
				System.out.println("\t"+arr[i]);
			}
		}
	}
}
