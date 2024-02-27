package com.mahait.programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSorting {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(2, "B");
		hashMap.put(5, "A");
		hashMap.put(7, "D");
		hashMap.put(1, "H");
		hashMap.put(9, "E");
		
		// By Using Stream sorted value
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println();
		// By Using Stream sorted key
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		ArrayList<Entry<Integer, String>> arrayList = new ArrayList<>(hashMap.entrySet());
		
		// By Using Annonymus Class Sort Value
		Collections.sort(arrayList, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println("Sorting By Value");
		arrayList.forEach(p ->{
			System.out.println("\t "+p.getValue());
		});
		
		// By Using Lambda Expression Sort Key 
		Collections.sort(arrayList, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		System.out.println();
		System.out.println("Sorting By Key");
		arrayList.forEach(p ->{
			System.out.println("\t "+p.getKey());
		});
	}

}



