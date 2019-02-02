package com.oca.exceptions;

interface Printable {}

class Ink {}
class ColorInk extends Ink implements Printable {}
class BlackInk extends Ink {}

public class ClassCast {
	
	public static void main(String...strings ) {
		Printable printable = null;
		BlackInk black = new BlackInk();
		printable = (Printable) black;
	}
	
	

}
