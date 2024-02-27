package com.mahait.programs;

import java.util.Comparator;
import java.util.stream.Stream;

// Input = 1,2,3,4,5,6,7,8,9,10 output = 9

public class SecondHighestNumberInArrayList {
	public static void main(String[] args) {
		Stream<Integer> of = Stream.of(1,2,3,4,5,6,7,8,9,10,11,11,12,11);
		
		Integer integer = of.sorted(Comparator.reverseOrder())
				.distinct().limit(2).skip(1).findFirst().get();
		System.out.println("Second Highest Number is = " +integer);
	}
}
