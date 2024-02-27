package com.mahait.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RemoveArraysDuplicate {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,1,2);
		
		 HashSet<Integer> hashSet = new HashSet<>(asList);
		 
		 for (Integer integer : hashSet) {

			 if(Collections.frequency(asList, integer) == 1) {
				 System.out.println(integer);
			 }
			
		}
			
	}

}
