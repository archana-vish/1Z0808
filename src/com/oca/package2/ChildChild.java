package com.oca.package2;

import com.oca.package1.ChildSamePkg;
import com.oca.package1.Parent;

public class ChildChild extends ChildSamePkg {

	public ChildChild() {}
	
	public static void main(String...strings ) {
		ChildChild child = new ChildChild();
		child.getMiddleName();
		System.out.println(child.middleName);
		
//		Parent p = new Parent();
//		System.out.println(p.getLastName());
		//p.getMiddleName(); // - error - diff package so not possible to refer only inherited
		
	}

}
