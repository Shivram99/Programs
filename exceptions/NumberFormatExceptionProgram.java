package com.mahait.exceptions;

public class NumberFormatExceptionProgram {

	public static void main(String[] args) {
		try {
			Integer num = new Integer("abc");
			System.out.println(num);
		}catch (Exception e) {
			System.out.println("exception caught");
			System.out.println(e);
		}
		
	}
}
