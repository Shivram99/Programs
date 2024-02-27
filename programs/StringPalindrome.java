package com.mahait.programs;


public class StringPalindrome {
	
	public static void main(String[] args) {
		
		
		String name = "nitin";
		
		String palindromeCheck = "";
		
		for(int i = name.length()-1; i >= 0; i-- ) {
			
			palindromeCheck = palindromeCheck + name.charAt(i);
		}
		
		if(name.equals(palindromeCheck)) {
			System.out.println("Palindrome : "+palindromeCheck);
		}
		else  {
			System.out.println("Reverse String : "+palindromeCheck);
		}
		
	}

}




