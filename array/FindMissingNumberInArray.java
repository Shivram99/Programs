package com.mahait.array;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,4,6,8,9,10};
		
		int tempSum = (10 * 11) / 2 ;
		int origizalSum = 0;
		for (int i= 0; i<=arr.length-1; i++) {
			origizalSum = origizalSum + arr[i];
		}
		System.out.println("Missing Number is : "+(tempSum - origizalSum));
	}
}
