package com.oca.lamdas;


public class Animal {
	
	private boolean canSwim;
	private boolean canHop;
	private boolean canFly;
	private String name;
	
	public Animal(String name, boolean canSwim, boolean canHop, boolean canFly) {
		this.name = name;
		this.canSwim = canSwim;
		this.canHop = canHop;
		this.canFly = canFly;
	}
	
	public boolean canHop() {
		return canHop;
	}
	
	public boolean canSwim() {
		return canSwim;
	}
	
	public boolean canFly() {
		return canFly;
	}
	
	public String toString() {
		return (name + (canSwim() ? " can " : " cannot ") + " swim "
				+ (canFly() ? " can " : " cannot ") + " fly "
				+ (canHop() ? " can " : " cannot ") + " hop ");
	}
	
	
	public static void main(String...strings ) {
		Animal frog = new Animal("Frog", true, true, false);
		System.out.println(whatCanIDo(frog, a -> a.canSwim()));
		System.out.println(whatCanIDo(frog, a -> a.canHop()));
		System.out.println(whatCanIDo(frog, a-> a.canFly()));
		System.out.println(frog.toString());
		
	}
	
	public static boolean whatCanIDo(Animal a, TestAnimal test) {
		return test.check(a);
	}
	
	
	
}