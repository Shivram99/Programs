package com.mahait.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(9);
		arrayList.add(10);
		arrayList.add(11);
		
		System.out.println("Original ArrayList ");
		System.out.println(arrayList);
		
		System.out.println();
		
		System.out.println("Reverse ArrayList ");
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		
		
	}
}
