/*Why the below class is showing compilation error*/

package com.mahait.abstraction;

abstract class DontHaveAbstractMethodBody {
	abstract void abstactMethod(){
		System.out.println("First Method");
	}
}



/*Rules : 1. Remove abstract Modifier
 * 		  2. Remove Method Body
 * Output : Because, abstract methods must not have a body.*/
 