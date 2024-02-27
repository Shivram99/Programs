package com.mahait.Inheritance;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		System.out.println(concateString("ONE", "TWO"));
		
		System.out.println(concateString("ONE", "TWO", "THREE"));

		System.out.println(concateString("ONE", "TWO", "THREE", "FOUR"));
	}

	 static String concateString(String string, String string2) {
		return string + string2;
	}

	 static String concateString(String string, String string2, String string3) {
		 return string + string2 + string3;
	}


	 static String concateString(String string, String string2, String string3, String string4) {
		 return string + string2 + string3 + string4;
	}

}
