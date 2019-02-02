package com.oca.abstracts;

abstract class Wow {
	public static void wow() {
		System.out.println("Wow wow");
	}
}


interface Pow {
	public static void wow() {
		System.out.println("Pow pow");
	}
}

public class StaticMethods extends Wow implements Pow {
	
	public static void wow() {
		System.out.println("Pow Wow");
	}
	
	public static void main(String...strings ) {
		StaticMethods sm = new StaticMethods();
		Pow.wow();
		sm.wow();
		Wow.wow();
	}
}