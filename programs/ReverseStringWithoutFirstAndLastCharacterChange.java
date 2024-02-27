package com.mahait.programs;

public class ReverseStringWithoutFirstAndLastCharacterChange {
	public static void main(String[] args) {
		
		String resver = "shivram";
		String reservebutnotFirstandLast = "" + resver.charAt(0);
		for (int i = resver.length() - 2; i >= 1; i--) {
			reservebutnotFirstandLast += resver.charAt(i);
		}
		reservebutnotFirstandLast += resver.charAt(resver.length() - 1);

		System.out.println("reservebutnotFirstandLast : " + reservebutnotFirstandLast);
	}
}
