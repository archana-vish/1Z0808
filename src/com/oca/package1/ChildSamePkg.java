package com.oca.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChildSamePkg extends Parent {
	
	static {
		System.out.println("Child static");
	}
	
	public ChildSamePkg() {
		System.out.println("Child constructor");
	}
	
	public static void main(String...strings ) {
		ChildSamePkg child = new ChildSamePkg();
		System.out.println(child.getLastName());
		System.out.println(child.getMiddleName());
		System.out.println(child.getFirstName());
		// child.getAge(); - cannot access pvt
		
		System.out.println(child.lastName);
		System.out.println(child.middleName);
		System.out.println(child.firstName);
		//System.out.println(child.age);
		
		Parent child2 = new ChildSamePkg();
		System.out.println(child2.getLastName());
		System.out.println(child2.getMiddleName());
		System.out.println(child2.getFirstName());
		// child.getAge(); - cannot access pvt
		
		System.out.println(child2.lastName);
		System.out.println(child2.middleName);
		System.out.println(child2.firstName);
		//System.out.println(child.child2);
		
		Parent parent = new Parent();
		System.out.println(parent.getLastName());
		System.out.println(parent.getMiddleName());
		System.out.println(parent.getFirstName());
		// child.getAge(); - cannot access pvt
		
		System.out.println(parent.lastName);
		System.out.println(parent.middleName);
		System.out.println(parent.firstName);
		
		List<String> alList = new ArrayList<>();
		String[] strArr = new String[4];
		alList.toArray(new String[4]);
		Arrays.asList(strArr);
		
		
		
	}

}
