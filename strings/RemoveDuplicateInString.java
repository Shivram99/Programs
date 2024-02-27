package com.mahait.strings;

import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicateInString {
	public static void main(String[] args) {
		String string = "Nitin";
		
		char[] charArray = string.toLowerCase().toCharArray();
		
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>();
		
		for (Character character : charArray) {
			
			linkedHashSet.add(character);
		}
		//System.out.print(linkedHashSet);
		
		for (Character character : linkedHashSet) {
			
			if(Collections.frequency(linkedHashSet, character) == 1) {
				 System.out.print(character);
			}
		}
	}
}
