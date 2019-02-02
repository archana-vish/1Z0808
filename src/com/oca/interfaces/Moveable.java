package com.oca.interfaces;

public interface Moveable {
	
	public String changePostion();
	
	public default void changePositionDefault() {
		//this.changePostion("aaa");
		System.out.println("Moveable");
	}
	
	public static void changePositionStatic() {
		
	}
	
	

}
