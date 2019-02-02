package com.oca.methodsAndVariables;

class People {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}

public class SwapPeople {
	
	public static void swap(People p1, People p2) {
		People temp = p1;
		p1 = p2;
		p2 = temp;
	}
	
	public static void hardReset(People p1, People p2) {
		String temp = p1.getName();
		p1.setName(p2.getName());
		p2.setName(temp);
	}
	
	public static void main(String...strings ) {
		People person1 = new People();
		person1.setName("John");
		People person2 = new People();
		person2.setName("Doe");
		
		System.out.println(person1.getName() + ":" + person2.getName());
		
		swap(person1, person2);
		
		System.out.println(person1.getName() + ":" + person2.getName());
		
		hardReset(person1, person2);
		
		System.out.println("Hard reset");
		
		System.out.println(person1.getName() + ":" + person2.getName());
		
		
		
	}
}
