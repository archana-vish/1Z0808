package com.oca.AccessControls.samepackage;

public class NotAChildProtected {
	
	public static void main(String...strings ) {
		ChildProtected child = new ChildProtected();
		System.out.println(child.getName());
		System.out.println(new ParentProtected().getName());
	}

}
