package com.oca.AccessControls.samepackage;

public class ChildPublic extends ParentPublic {
	
	public static void main(String...strings ) {
		ChildPublic child = new ChildPublic();
		System.out.println(child.name + child.getName());
		System.out.println(new ParentPublic().getName());
	}

}
