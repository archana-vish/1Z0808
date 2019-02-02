package com.oca.datatypes;

public class Characters {
	
	
	public static void main(String...strings ) {
		char c = (char) -122;
		System.out.println(c);
		System.out.println("=====");
		c = '\u0122';
		System.out.println('\u0122');
		System.out.println("=====");

		c = (char) 65535;
		System.out.println(Math.pow(2,16));
		System.out.println("=====");

		System.out.println(++c);
		System.out.println("=====");

		
		System.out.println((char)-220);
		System.out.println("=====");

		c = (char) 127;
		System.out.println(c);
		System.out.println("=====");

	}

}
