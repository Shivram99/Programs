package com.mahait.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateSum {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,2,5,5,6,5,5,2,3,1);
		
		 int sum = 0;
		 for (Integer integer : asList) {

			 if(Collections.frequency(asList, integer) != 1) {
				 sum = sum + integer;
			 }
			
		}
		 System.out.println("Sum of duplicate is : "+sum );
	}

}
