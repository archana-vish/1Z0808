package com.oca.interfaces;

public interface Jumpable {
	
	public String changePostion();
	
	public default void changePositionDefault() {
		System.out.println("Jumpable");
	}
	
	/*public static void changePositionStatic() {
		
	}*/

}
