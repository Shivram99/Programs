package com.mahait.java8;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinAndMaxValueInArrayListByUsingStream {
	
	public static void main(String[] args) {
		
		IntSummaryStatistics stats = Stream.of(1,2,3,4,5,1,11,6,7,8,9,10)
				.collect(Collectors.summarizingInt(Integer::intValue));
		
			int min = stats.getMin();
			int max = stats.getMax();
			
			System.out.println("Min Value = "+min+ "\nMax Value = "+max);
			
	}

}
