package com.mahait.programs;
import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		 String firstString = "aaba";
		 String secondString = "aaab";
		 
		 char[] charArray = firstString.toCharArray();
		 Arrays.sort(charArray);
		 
		 char[] charArray1 = secondString.toCharArray();
		 Arrays.sort(charArray1);
		 if(charArray.length == charArray1.length && Arrays.equals(charArray, charArray1)) {
			 System.out.println("String is Anagram");
		 }else {
			 System.out.println("String is not Anagram");
		 }
		 
		 
		 System.out.println("Check if the firstString and secondString is anagram of each other: "+ isAnagram(firstString, secondString));
		 }
		 
		    public static boolean isAnagram(String firstString, String secondString){
		        char[] firstStringCharArray = firstString.toLowerCase().toCharArray();
		        char[] secondStringCharArray = secondString.toLowerCase().toCharArray();       
		        Arrays.sort(firstStringCharArray);
		        Arrays.sort(secondStringCharArray);
		       
		        return Arrays.equals(firstStringCharArray, secondStringCharArray);
		        
		    }
}
