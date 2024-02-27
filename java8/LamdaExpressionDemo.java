package com.mahait.java8;

// Syntax (argument-list) -> {implementation}
public class LamdaExpressionDemo {
	public static void main(String[] args) {
		Drawable drawable = new Drawable() {

			@Override
			public void draw(int width) {
				System.out.println("Drawing "+width );
			}
		};
		drawable.draw(5);
		// Lamda Expression
		Drawable dLambda = (int width) -> System.out.println("Drawing "+width);

		dLambda.draw(10);
	}

}
