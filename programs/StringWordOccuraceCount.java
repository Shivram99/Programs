package com.mahait.programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StringWordOccuraceCount {
	public static void main(String[] args) {
		String str ="Mane Shivram Namdev Mane Shivram Namdev Harwadi";
		
		String[] split = str.split("\\s");
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for (String string : split) {

			arrayList.add(string);
		}
		
		/*Map<String, Long> collect = arrayList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
		*/
		
		HashSet<String> hashSet = new HashSet<>(arrayList);
		for (String string : hashSet) {
			System.out.println(string +"\t"+Collections.frequency(arrayList, string));
		}
	}

}
