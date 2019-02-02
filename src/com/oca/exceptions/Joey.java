package com.oca.exceptions;

public class Joey extends Kangaroo {
	public void hop() throws RuntimeException{}
}

class Kangaroo {
	public void hop() throws MyException {}
}

class MyException extends Exception {}