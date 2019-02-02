package com.oca.exceptions;

public class Laptops {
	
	public static void main(String...strings ) {
		String[][] oldLaptops = {
				{"Dell", "Toshiba", "Vaio"},
				null,
				{"IBM"},
				new String[10]
		};
		System.out.println(oldLaptops[0][0]); // Dell
		System.out.println(oldLaptops[1]); // null
		System.out.println(oldLaptops[3][6]); //null
		//System.out.println(oldLaptops[3][0].length()); //NPE
		System.out.println(oldLaptops); //[[Ljava.lang.String;@addr
	}

}
