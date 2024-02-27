package com.mahait.staticProgram;

public class StaticBody {
	
	static {
		System.out.println("Second Step Execute ....");
	}
	
	public static void main(String[] args) {
		System.out.println("First Step Execute ...");
	}
}
