package com.mahait.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentHashmapExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>(); 
		//CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		
		Iterator<Integer> iterator = arrayList.iterator();  
		while (iterator.hasNext())  
		{  
		arrayList.add(7);
		Integer i =  iterator.next();  
		
		System.out.println(i);  
		  
		}  
	}
}
