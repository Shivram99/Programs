package com.mahait.array;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindSecondHighestElementInArray {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,8,9,9,10);
		stream.sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).forEach(System.out::println);
		
	}
}
