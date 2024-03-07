package com.mahait.exceptions;

public class ArithmaticExceptionProgram {

	public static void main(String[] args) {
		
		try {
			int i = 1000 / 0;
		}catch (Exception e) {
			System.out.println("In Exception");
			System.out.println("Exception is : "+e);
		}
	}
}
