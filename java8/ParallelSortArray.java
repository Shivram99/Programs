package com.mahait.java8;

import java.util.Arrays;

public class ParallelSortArray {
	
	public static void main(String[] args) {
		int [] numbers = {9,5,7,1,3,8,2,6,4};
		
		Arrays.parallelSort(numbers);

		System.out.println("Sorted Array : ");
		for (int i : numbers) {
			System.out.print(i +" ");
		}
	}
}