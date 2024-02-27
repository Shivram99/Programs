package com.mahait.strings;

public class CountZerosAndOnes {
	public static void main(String[] args) {

		int arr[] = {1,1,1,0,0,0,1,0,1,0,0,0,0,1};
		
		int zerosCount = 0 ;
		
		for (int i : arr) {
			if(i != 1) {
				zerosCount = zerosCount + 1;
			}
		}
		
		System.out.println("Zeros is : "+zerosCount+"\n"+"Ones is : "+(arr.length - zerosCount));

	}
}
