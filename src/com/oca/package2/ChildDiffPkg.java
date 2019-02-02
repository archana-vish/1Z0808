package com.oca.package2;

import com.oca.package1.Parent;

public class ChildDiffPkg extends Parent {
	
	public static void main(String...strings) {
		ChildDiffPkg child = new ChildDiffPkg();
		System.out.println(child.getLastName() + child.getMiddleName());
		System.out.println(child.lastName + child.middleName);
		
		Parent p = new Parent();
		System.out.println(p.getLastName() );
	}

}
