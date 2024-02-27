package com.mahait.programs;

// Input : I Love Programming
// Output : Programming Love I 
public class StringWordProgram {
	public static void main(String[] args) {
		String word = "India is my Country";
		
		String[] split = word.split(" ");
		String reverse = "";
		for(int i=split.length-1; i>=0; i--) {
			reverse = reverse + split[i]+" ";
		}
		System.out.println(reverse);
	}
}
