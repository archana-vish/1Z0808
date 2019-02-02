package com.oca.exceptions;

public class ErrorHandling {
	
	public static void main(String...strings ) {
		try {
			myMethod();
		} catch (StackOverflowError sfe) {
			System.out.println("Toast");
			for (int i = 0; i > 2; ++i) {
				System.out.println(i);
			}
		}
	}
	
	public static void myMethod() {
		System.out.println("Running out of steam");
		myMethod();
	}

}
