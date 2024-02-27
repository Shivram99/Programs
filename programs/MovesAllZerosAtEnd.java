package com.mahait.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MovesAllZerosAtEnd {

	public static void main(String[] args) {

		int arr [] = {0,1,2,0,0,0,3,4};

		ArrayList<Integer> listWithoutZeros = new ArrayList<Integer>();
		ArrayList<Integer> listWithZeros = new ArrayList<Integer>();
		ArrayList<Integer> finalResult = new ArrayList<Integer>();

		for(int i : arr) {
			if(i != 0) {
				listWithoutZeros.add(i);
			}else {
				listWithZeros.add(i);
			}
		}

		finalResult.addAll(listWithoutZeros);
		finalResult.addAll(listWithZeros);
		
		System.out.println("By Using Collections");
		System.out.println(finalResult);
		
		System.out.println();
		
		/*By Using Java 8 FlatMap*/
		List<ArrayList<Integer>> asList = Arrays.asList(listWithoutZeros,listWithZeros);
		List<Integer> collect = asList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("By Using java 8 FlatMap ");
		System.out.println(collect);
		
		/*second highest number*/
		Integer integer = finalResult.stream().sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println();
		System.out.println("Second Highest Number : "+integer);
	}

}
