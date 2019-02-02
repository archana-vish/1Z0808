package com.oca.override;

class Rodent {
	protected static int chew() throws Exception {
		System.out.println("Rodent is chewing");
		return 1;
	}
}

abstract class Abstract {
	public abstract  void someMethod();
	
	public static void method2() {}

}

public class Beaver extends Rodent {
	
	public static int chew() throws RuntimeException {
		System.out.println("Beaver is chewing");
		return 2;
	}

}
