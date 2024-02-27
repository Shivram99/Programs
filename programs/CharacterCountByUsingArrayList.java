package com.mahait.programs;
import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterCountByUsingArrayList {
	
	public static void main(String[] args) {
		String str ="maneeee";
		
		char[] charArray = str.toCharArray();
		
		HashMap<Character, Integer> hashMap = new HashMap<Character,Integer>();
		for (char c : charArray) {

			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
		}
		
		System.out.println(hashMap);
		
			for (Entry<Character, Integer> entry : hashMap.entrySet()) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey() +" = "+entry.getValue());
				}
			}
	}

}
