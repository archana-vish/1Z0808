package com.oca.package1;

public class Parent {
	
	static {
		System.out.println("Parent static");
	}
	
	public Parent() {
		System.out.println("Parent constructor");
	}
	
	public String lastName = "V";
	protected String middleName = ".";
	String firstName = "A";
	private int age = 35;
	
	public String getLastName() {
		return lastName;
	}
	
	protected String getMiddleName() {
		return middleName;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	private int getAge() {
		return age;
	}

}
