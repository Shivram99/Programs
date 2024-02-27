package com.mahait.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TwoArraysCommonElementDisplay {

	public static void main(String[] args) {

		int[] array1 ={1,2,3,4,5};
		int[] array2 ={1,2,6,5,7,5};

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (Integer integer : array1) {
			arrayList.add(integer);
		}
		for (Integer integer : array2) {
			arrayList.add(integer);
		}

		HashSet<Integer> hashSet = new HashSet<>(arrayList);

		for (Integer integer : hashSet) {

			if(Collections.frequency(arrayList, integer) != 1) {
				System.out.print(" "+integer);
			}

		}
	}

}
