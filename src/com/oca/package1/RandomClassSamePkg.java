package com.oca.package1;

public class RandomClassSamePkg {
	
	public static void main(String...strings) {
		RandomClassSamePkg r1 = new RandomClassSamePkg();
		
		Parent p = new Parent();
		System.out.println(p.getFirstName() + p.getMiddleName() + p.getLastName());
		System.out.println(p.firstName + p.middleName + p.lastName);
		
	}

}
