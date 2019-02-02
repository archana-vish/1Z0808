package com.oca.AccessControls.differentpackage;

public class ChildOfChildProtected extends ChildProtected {
	
	public static void main(String...strings ) {
		ChildOfChildProtected child = new ChildOfChildProtected();
		System.out.println(child.getName());
		//System.out.println(new ChildProtected().getName());
	}

}
