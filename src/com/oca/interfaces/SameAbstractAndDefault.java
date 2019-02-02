package com.oca.interfaces;

interface i3 {
	public void m1();
}

interface i4 extends i3 {
	public default void m1() {
		System.out.println("default from i2");
	}
}

public class SameAbstractAndDefault implements i3, i4{
//	public void m1() {
//		System.out.println("Implemented");
//	}
	
	public static void main(String...strings ) {
		SameAbstractAndDefault sad = new SameAbstractAndDefault();
		sad.m1();
	}
}
