package com.oca.interfaces;

interface i5 {
	public void m1();
}

interface i6 {
	public static void m1() {
		System.out.println("static method");
	}
}

public class SameAbstractAndStatic implements i5, i6 {
	public void m1() {
		System.out.println("Method1");
	}
	
	public static void main(String...strings ) {
		SameAbstractAndStatic sas = new SameAbstractAndStatic();
		sas.m1();
		i6.m1();
		i6.m1();
	}
}
