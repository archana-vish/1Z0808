package com.oca.AccessControls.differentpackage;

import com.oca.AccessControls.samepackage.ParentDefault;

public class ChildDefault extends ParentDefault {
	
	public static void main(String...strings ) {
		ChildDefault child = new ChildDefault();
		//System.out.println(child.getName());
		//System.out.println(new ParentDefault().getName());
	}
	

}
