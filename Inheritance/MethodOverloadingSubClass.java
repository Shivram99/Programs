package com.mahait.Inheritance;

public class MethodOverloadingSubClass extends MethodOverloadingSuperClass {
	@Override
	void SuperClassMethod()
    {
        System.out.println("SUPER CLASS METHOD IS OVERRIDDEN");
    }
	
	public static void main(String[] args) {
		MethodOverloadingSubClass mosc = new MethodOverloadingSubClass();
		mosc.SuperClassMethod();
	}
}
