package com.mahait.programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StringCharacterOccuranceCount {
	
	public static void main(String[] args) {
		String str ="maneeeeeSs";
		str = str.toUpperCase();
		
		// Convert String to Char
		char[] char1  = str.toCharArray();
		
		ArrayList<Character> arrayList = new ArrayList<Character>();
		
		// Add one by one Character in arraylist
		for (char c : char1) {
			arrayList.add(c);
		}
		
		// arraylist add in hashset for unique value
		HashSet<Character> hashSet = new HashSet<>(arrayList);
		
		// Character Iterator for frequency check
		for (Character character : hashSet) {
			System.out.println(character + " = " +Collections.frequency(arrayList, character));
		}
		
	}

}
