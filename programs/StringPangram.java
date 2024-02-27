package com.mahait.programs;
import java.util.HashSet;

public class StringPangram {

	public static void main(String[] args) {
		String s = "abcdEFGHijklmnOPQRStuvwxyz";

		char ch[] = s.toCharArray();
		HashSet<Character> alphabets = new HashSet<Character>();

		for (Character ch1 : ch) {
			alphabets.add(ch1);
		}
		if (alphabets.size() == 26) {
			System.out.println("The String is Pangram");
		} else {
			System.out.println("The String is not Pangram");
		}
	}
}
