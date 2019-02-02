package com.oca.methodsAndVariables;

public class SameName {
	
	private String name = "Silly Program";
	
	public void name() {
		System.out.println("ridiculous " + name);
	}
	
	public static void main(String...strings ) {
		new SameName().name();
	}

}
