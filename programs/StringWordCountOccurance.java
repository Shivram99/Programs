package com.mahait.programs;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StringWordCountOccurance {
	
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Mane","Brijoy","Mane","Brijoy","Mane","Shivram");
		
		HashSet<String> hashSet = new HashSet<>(asList);
		
		for (String string : hashSet) {
			System.out.println(string + "\t" +Collections.frequency(asList, string));
		}
	}

}
