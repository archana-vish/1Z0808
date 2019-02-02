package com.oca.AccessControls.differentpackage;

import com.oca.AccessControls.samepackage.*;

public class NotAChildPublic {
	
	public static void main(String...strings ) {
		ParentPublic parent = new ParentPublic();
		System.out.println(parent.getName());
	}


}
