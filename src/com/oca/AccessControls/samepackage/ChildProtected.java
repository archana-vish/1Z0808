package com.oca.AccessControls.samepackage;

public class ChildProtected extends ParentProtected {
	
	public static void main(String...strings ) {
		ChildProtected child = new ChildProtected();
		System.out.println(child.getName());
		System.out.println(new ParentProtected().getName());
	}

}
