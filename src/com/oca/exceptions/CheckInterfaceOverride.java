package com.oca.exceptions;

class HasSoreThroatException extends Exception {}

class TiredException extends RuntimeException {}

interface Roar {
		void roar() throws HasSoreThroatException;
}

public class CheckInterfaceOverride implements Roar {
	
	public void roar() throws TiredException{}
	
}
