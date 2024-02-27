/*Which class is instantiable? Class A or Class B*/

package com.mahait.abstraction;

abstract class A
{
     
}
 
class B extends A
{
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
	}
}

/* OutPut : Cannot instantiate the type A , Because class is abstract so 
 * abstract class not be instantiate
 */
*/