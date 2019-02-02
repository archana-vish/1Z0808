package com.oca.interfaces;

public class TestAbstractMethods implements Moveable, Jumpable{
	
	//public String changePostion() {System.out.println("Stringy...");return "";}
	
	//public void changePosition() {System.out.println("void");}
	
	public void changePostion(String name) {return;}

	
	
	public static void main(String...strings ) {
		Moveable moveable = new TestAbstractMethods();
		TestAbstractMethods nullt = null;
		Moveable.changePositionStatic();
	}

	@Override
	public String changePostion() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void changePositionStatic() {
		System.out.println("In the class");
	}
	
	public void changePositionDefault() {
		//this.changePostion("aaa");
		System.out.println("Moveable");
	}

}

