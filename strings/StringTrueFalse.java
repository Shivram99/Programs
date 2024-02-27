package com.mahait.strings;

import java.util.Optional;

public class StringTrueFalse {
	
	public static void main(String[] args) {
		String str ="hello";  
		String str1 = new String(str);
		
		StringBuffer sb = new StringBuffer("ABC");
		StringBuffer sb8 = new StringBuffer("ABC");
		System.out.println(sb.hashCode() == sb8.hashCode());
		System.out.println(sb.toString().hashCode() == sb8.toString().hashCode());
		
		
		System.out.println(sb==sb8);
		System.out.println("HashCode "+sb.hashCode());
		System.out.println("HashCode "+sb8.hashCode());
		System.out.println(sb.equals(sb8));
		System.out.println(sb.toString().hashCode() == sb8.toString().hashCode());
		System.out.println("----------");
		StringBuilder s2 = new StringBuilder(str);
		
		StringBuffer sb1 = sb;
		String str2 = sb1.toString();
		String str3 = s2.toString();
		String str4 = null;
		Optional<String> str5 = Optional.ofNullable(null);
		
		System.out.println(str == str1);  //refere
		System.out.println(str1.equals(sb)); //true
		System.out.println(str1.equals(s2)); 
		//System.out.println(str2 == sb); // compile time error
		//System.out.println(str3 == s2); // compile time error
		System.out.println(str2.equals(sb1)); 
		System.out.println(str3.equals(s2));  
		System.out.println(sb.equals(s2)); 
		//System.out.println(sb == s2); // compile time error
		System.out.println(str5.get().equals(str4));  
		System.out.println(str4 == str5.get()); 
		
		
	}

}
