package com.mahait.programs;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxCharacterOccuracy {
	
	public static void main(String[] args) {
			String str ="maneeeeeeSse eeee"; 
			char[] charArray = str.replaceAll("\\s+", "").toCharArray();
			ArrayList<Character> arrayList = new ArrayList<Character>();
			for (char c : charArray) {
				arrayList.add(c);
			}
			
			Optional<Entry<Character, Long>> max = arrayList.stream()
					.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
				    .max(Map.Entry.comparingByValue());
			System.out.println(max.get());
			
	        /*HashMap<Character, Integer> charCountMap = new HashMap<>();
	         
	        char[] charArray = str.replaceAll("\\s+", "").toCharArray();
	         
	        for (char c : charArray) 
	        {
	            if (charCountMap.containsKey(c))
	            {
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                charCountMap.put(c, 1);
	            }
	        }
	         
	        Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();
	         
	        int maxCount = 0;
	         
	        char maxChar = 0;
	         
	        for (Entry<Character, Integer> entry : entrySet) 
	        {
	            if (entry.getValue() > maxCount)
	            {
	                maxCount = entry.getValue();
	                 
	                maxChar = entry.getKey();
	            }
	        }
	         
	         
	        System.out.println("Maximum Occurring char and its count :");
	         
	        System.out.println(maxChar+" : "+maxCount);*/
	    }
}