package com.mahait.array;

import java.util.Arrays;

public class CheckEqualityOfTwoArray {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		/* First Way */
		System.out.println(Arrays.equals(array1, array2) ? "Same Array" : "Not Same Array");

		/* Second Way */
		boolean flag = true;

		if (array1.length == array2.length) {

			for (int i = 0; i <= array1.length - 1; i++) {
				if (array1[i] != array2[i]) {
					flag = false;
					break;
				}
			}
		} else {
			flag = false;
		}
		
		if (flag) {
			System.out.println("Same Array");
		} else {
			System.out.println("Not Same Array");
		}
	}

}
