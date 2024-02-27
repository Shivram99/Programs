package com.mahait.strings;

import java.util.Random;

public class GenerateOTP {

	public static void main(String[] args) {
		
		String[] arra = new String[5];

		  arra[0] = " +\"\"\"\"\"+ ";
		  arra[1] = "[| o o |]";
		  arra[2] = " |  ^  |";
		  arra[3] = " | '-' |";
		  arra[4] = " +-----+";

		  for (int i = 0; i < arra.length; i++) {
		   System.out.println(arra[i]);
		  }
		
		String numbers ="0123456789";
		int length = 4;
		Random randomNumber = new Random();
		char[] tempOtp = new char[length];
		for(int i = 0 ; i < length ; i++) {
			tempOtp[i] = numbers.charAt(randomNumber.nextInt(numbers.length()));
		}
		System.out.print("OTP ");
		System.out.print(tempOtp);
	}
	
}
