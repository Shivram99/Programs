/*Below class AbstractOrMayNotAbstractMethods
 *  doesn’t have even a single abstract method, 
 *  but it has been declared as abstract. Is it correct*/

package com.mahait.abstraction;

abstract class AbstractOrMayNotAbstractMethods {

	abstract void firstMethod(){
		System.out.println("First Method");
	}
	void secondMethod(){
		System.out.println("Second Method");
	}
	
}


/* Rules : 1. Remove abstract Modifier
 * 		  2. Remove Method Body
  * output : Yes, it is correct. abstract classes may or may not have abstract methods. 
  * 
*/
 