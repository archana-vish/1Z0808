package com.oca.datatypes;

import java.util.*;

public class FloatsAndDouble {
	
	public static void main(String...strings ) {
		float f1 = 3.0f;
		float f2 = 2.1f;
		double d1 = 3;
		System.out.println(f1 + f2 + d1);
		float f3 = 2;
		
		System.out.println(f3);
		
		List<Double> alDoubles = new ArrayList<Double>();
		System.out.println(alDoubles.indexOf(1.0));
		System.out.println(alDoubles.contains("string"));
		
		System.out.println(Float.parseFloat("0b1010101f"));
		
	}

}
