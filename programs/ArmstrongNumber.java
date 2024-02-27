package com.mahait.programs;

import java.util.stream.IntStream;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int rem, sum = 0;

		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum += rem * rem * rem;
		}
		System.out.println("----- For Using Legacy Way -----");
		System.out.println((temp == sum) ? "Armstrong No : "+temp : "Not Armstrong No");
		
		
		System.out.println("---- By Using Java  ------");
		
		IntStream.range(100, 500)
        .filter((n) -> {
            int c = 0, temp1 = n;
            while (temp1 > 0) {
                c += Math.pow(temp1 % 10, Integer.toString(n).length());
                temp1 /= 10;
            }
            return c == n;
        }).forEach(System.out::println);
		
		
	}
}
