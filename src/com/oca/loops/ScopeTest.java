package com.oca.loops;

public class ScopeTest {
	
	public static void main(String...strings ) {

		for(int i = 0; i <10; i++) System.out.println(i);
		for(int i = 10; i > 10; i--) System.out.println(i);
		
		
		int[] num = new int[10];
		
		for (final int i:num) {}
		
		int i = 20;

		System.out.println(i);

	}

}
