package com.mahait.strings;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Only Paranthesis String : ");
		String string = scanner.next();
		boolean output = balancedParanthesisString(string);
		
		if(output == true) {
			System.out.println("Balanced Paranthesis ");
		}else {
			System.out.println("No Balanced Paranthesis ");
		}
	}

	private static boolean balancedParanthesisString(String string) {
		Stack<Character> stack = new Stack<>();
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '(') {
				 stack.push(charArray[i]);
			}
			
			char check;
			switch (charArray[i]) {
			case ')':
				check = stack.pop();
				if(check == '}' || check == ']') {
					return false;
				}
				break;
			case '}':
				check = stack.pop();
				if(check == ']' || check == ')') {
					return false;
				}
				break;
			case ']':
				check = stack.pop();
				if(check == '}' || check == ')') {
					return false;
				}
				break;
			}
		}
		
		return stack.isEmpty();
	}

}
