package com.mahait.programs;

public class StringSum {

	public static void main(String[] args) {
		String str = "m55va44sur12";
		String num = "";
		int sum = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (Character.isDigit(str.charAt(i))) {
				num = num + str.charAt(i);
				if (i==str.length()-1) {
					sum = sum + Integer.parseInt(num);
				}
			} else {
				if (!num.equals("")) {
					sum = sum + Integer.parseInt(num);
					num = "";
				}
			}
		}
		System.out.println(sum);

	}
}
