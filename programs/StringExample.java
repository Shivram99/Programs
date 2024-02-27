package com.mahait.programs;
import java.util.Scanner;

public class StringExample {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/* Swap Without third variable */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number A : ");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number B : ");
		int b = scanner.nextInt();
		
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
		
		/*Sum of integer*/
		String str = "1Shivram1234Mane1"; 
		int sum=0;
		String temp = "0";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch))
			{
				temp+=ch;
				sum +=Integer.parseInt(temp);
				temp= "0";
			}
		}
		System.out.println("sum = "+sum);
	}
}
