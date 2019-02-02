package com.oca.order;

/**
 * SUPER CLASS FIRST
 * STATIC VARIABLES AND STATIC INITIALIZERS
 * CHILD VARIABLES AND CHILD STATIC INITIALIZERS
 * INSTANCE VARIABLES AND INSTANCE INITIALIZERS
 * CONSTRUCTOR
 * CHILD INSTANCE BLOCKS AND LAST CHILD CONSTRUCTOR
 * @author av8242n
 *
 */

class SuperClass {
	static String name = "Super Java";
	
	static {
		name += "Initiliazers";
		System.out.println("Name :: " + name);
	}

	SuperClass() {
		System.out.println("Super class constructor");
	}
	
	{
	System.out.println("super instance block...." + name); 
	}
}

public class GetTheOrderRight extends SuperClass {
	
	static String name = "Java";
	
	static {
		name += "Initiliazers";
		System.out.println("Name :: " + name);
	}

	GetTheOrderRight() {
		System.out.println("Child Constructor");
	}
	
	{
	System.out.println("instance block...." + name); 
	}
	
	public static void main(String... strings) {
		GetTheOrderRight order = new GetTheOrderRight();
//		GetTheOrderRight order2 = new GetTheOrderRight();

	}
	
}
