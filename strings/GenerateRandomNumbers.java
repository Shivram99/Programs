package com.mahait.strings;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int nextInt = scanner.nextInt();
		
		Random random = new Random();
		random.ints(0, 100).limit(nextInt).forEach(System.out::println);
		
	}
}
