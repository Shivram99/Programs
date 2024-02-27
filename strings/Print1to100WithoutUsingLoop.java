package com.mahait.strings;

import java.util.Scanner;

public class Print1to100WithoutUsingLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting point : ");
		int nextInt = sc.nextInt();
		
		System.out.println("Enter Ending Point : ");
		int target = sc.nextInt();
		
		print1to100(nextInt,target);
	}

	private static void print1to100(int number, int target) {
		while(number <= target) {
			System.out.print(" "+number);
			number++;
		}
		
	}

}
