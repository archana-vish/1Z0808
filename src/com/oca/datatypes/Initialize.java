package com.oca.datatypes;

public class Initialize {
	
	public static void main(String...strings ) {
		boolean b1, b2, b3, b4, b5, b6;
		b1 = b2 = b3 = false;
		//b4 = 0;
		//b5 = 'false';
		//b6 = yes;
		int i = 3;
		System.out.println(++i);
		
		Character c1 = 'a';
		Character c2 = new Character('c');
		Character c3 = Character.valueOf('c');
		
		boolean bl1 = Boolean.parseBoolean("TRue");
		System.out.println(bl1);
		
		Integer i1 = new Integer(30);
		Integer i2 = Integer.valueOf(30);
		Integer i3 = Integer.valueOf("30");
		Integer i4 = new Integer(30);
		Integer i5 = new Integer("30");
		
		System.out.println("i1 == i2 :: " + (i1 == i2));
		System.out.println("i2 == i3 :: " + (i2 == i3));
		
		
		System.out.println(i1.equals(i2));
		System.out.println(i2.equals(i3));
		
		Boolean bl2 = new Boolean(true);
		Boolean bl3 = Boolean.valueOf("true");
		Boolean bl4 = Boolean.valueOf(true);
		Boolean bl5 = Boolean.TRUE;
		
		System.out.println("bl2 == bl3 :: " + (bl2 == bl3));
		System.out.println("bl3 == bl4 :: " + (bl3 == bl4));
		System.out.println("bl3 == bl5 :: " + (bl3 == bl5));
		System.out.println("bl2 == bl5 :: " + (bl2 == bl5));
		System.out.println("new Boolean(true) == Boolean.TRUE :: " +
					(new Boolean(true) == Boolean.TRUE));
		System.out.println("new Boolean(true) == Boolean.valueof(true) :: " +
				(new Boolean(true) == Boolean.valueOf(true)));
		

		
		short a4 = 10;
		
		boolean bool1 = Boolean.TRUE;
		
		double d = 10;
		
		char one = 'a';
		char two = 'b';
		
		int result = one + two;
		
		System.out.println(result);
		
		System.out.println(one+two);
		
		
		Boolean boolean1 = new Boolean(true);
		
		char character = 30000;
		System.out.println(character);
		
		
		
		
		
	}

}
