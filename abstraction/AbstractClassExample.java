package com.mahait.abstraction;

abstract class AbstractClassExample
{
	
	private abstract int abstractMethod();
}


/* Output : abstract methods can’t be private
 * Rules 1. The abstract method abstractMethod in type AbstractClassExample 
 * can only set a visibility modifier, 
 * one of public or protected
 * */
 