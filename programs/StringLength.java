package com.mahait.programs;

import java.util.HashSet;
import java.util.Hashtable;

public class StringLength {
	public static void main(String[] args) {
		
		
		
		String s1 = "dddddddddddddddddddddddddd";
		String s2 ="_AST";
		String s3 = s1.concat(s2);
		System.out.println("Lenght is "+s3.length());
		System.out.println(s3);
		
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("");
		hashSet.add(null);
		System.out.println(hashSet);
		
		Hashtable hashtable = new Hashtable();
		hashtable.put(1, null);
		System.out.println(hashtable);
	}
}
