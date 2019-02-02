package com.oca.package1;

 class SuperClass {

	private final void overrideThis() {
		System.out.println("Super");
	}
	
	public static void overrideThis(String name) {
		System.out.println("Actually a super overload");
	}

}

public class TestFinal extends SuperClass {
	
	public static void overrideThis(String name) {
		System.out.println("Actually an overload");
	}
	public static void main(String...strings) {
		SuperClass obj = new TestFinal();
		obj.overrideThis("a");
		
	}
	
}
