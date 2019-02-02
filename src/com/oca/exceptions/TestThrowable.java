package com.oca.exceptions;

class SomeThrowable extends Throwable {}

class MyThrowable extends SomeThrowable {}

public class TestThrowable {
	public static void main(String...strings ) {
		try {
			m1();
		} catch(SomeThrowable e) {
			//throw e;
		} finally {
			System.out.println("Done");
		}
	}
	
	public static void m1() throws MyThrowable {
		throw new MyThrowable();
	}
}
