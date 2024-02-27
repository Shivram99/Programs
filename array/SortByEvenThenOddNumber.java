package com.mahait.array;

import java.util.ArrayList;

/*input = {2,4,8,20,1,5,7,11};
 output = {1,2,5,4,7,8,11,20}*/
public class SortByEvenThenOddNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,5,4,7,8,11,20};
		
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		
		for (Integer integer = 0 ; integer < arr.length; integer++) {
			if(arr[integer] % 2 == 0) {
				evenList.add(arr[integer]);
			}else {
				oddList.add(arr[integer]);
			}
		}
		finalList.addAll(evenList);
		finalList.addAll(oddList);
		
		System.out.println(finalList);
	}
}
