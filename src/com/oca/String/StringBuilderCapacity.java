package com.oca.String;

public class StringBuilderCapacity {
	
	public static void main(String...strings ) {
		StringBuilder s = new StringBuilder(3);
		s.append("abc");
		System.out.println(s.length() + "\t" + s.capacity());
		s.append("d");
		System.out.println(s.length() + "\t" + s.capacity());
		
		
	}

}
