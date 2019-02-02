package com.oca.constructors;

public class TestThis {
	
	private String name;
	private double weight;
	
	public TestThis() {
		
	}
	
	public TestThis(double weight) {
		this("", weight + 10);
		this.weight = weight;

	}
	
	public TestThis(String name, double weight) {
		weight = weight;
		this.name = name;
	}
	
	public static void main(String...strings ) {
		TestThis cub = new TestThis(44);
		System.out.println(cub.weight + " " + cub.name);
	}

}


class SubTest extends TestThis {
	
	public SubTest(String name) {
		
		super(name, 0);
	}
	
	public SubTest(double weight) {
		
	}
}

