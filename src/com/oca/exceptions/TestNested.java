package com.oca.exceptions;

public class TestNested {
	
	public static void main(String...strings ) {
		System.out.println("a");
		try {
			System.out.println("b");
			throw new RuntimeException();
		} catch (IllegalArgumentException e) {
			System.out.println("c");
			throw new RuntimeException();
		} catch(RuntimeException e) {
			System.out.println("d");
			throw new RuntimeException("2");
		} finally {
			System.out.println("e");
			throw new RuntimeException("3");
		}
	}

}


