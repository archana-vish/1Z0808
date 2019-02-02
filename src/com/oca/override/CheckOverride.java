package com.oca.override;

import java.io.IOException;

class Super {
	public static void someMethod(){}
}

class Child extends Super {
	public static void someMethod() {} // One of them cannot be static and the other non-static
}

interface SuperInterface {
	public static void someMethod() {}
}

interface ChildInterface extends SuperInterface {
	public void someMethod();
}

public class CheckOverride {
	
	public static void main(String...strings ) {
		Super child = new Child();
		child.someMethod();
	}

}
