package com.oca.interfaces;

interface i1 {
	public abstract void m1();
}

interface i2 extends i1 {
	public abstract void m1();
}

public class SameAbstractMethods implements i2 {
	
	public void m1() {
		System.out.println("Not a problem because this is an implementation");
	}
	
	public static void main(String...strings ) {
		SameAbstractMethods sam = new SameAbstractMethods();
		sam.m1();
	}

}
