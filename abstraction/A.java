/*  Below code snippet is showing compilation error? Can you suggest the corrections */

package com.mahait.abstraction;

abstract class A
{
    abstract int add(int a, int b);
}
 
class B extends A
{
     
}

/* Rules : 1. Add unimplemented methods
 * 		   2. Make type B abstract
 * Output : Class B must implement inherited abstract method A.add() or else it must be declared as abstract
 */
 