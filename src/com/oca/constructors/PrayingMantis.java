package com.oca.constructors;

abstract class Insect {
	
	public Insect(int age) {
		System.out.println("1");
	} 
	
	public Insect(String colour) {
		this(5);
		System.out.println("2");
	}
}

public class PrayingMantis extends Insect {
	
	public PrayingMantis(String colour) {
		super(colour);
		System.out.println("3");
		System.out.println(5/2);
	}
	
	public static void main(String...strings ) {
		new PrayingMantis("red");
		
		BabyPrayingMantis baby = new BabyPrayingMantis();
		PrayingMantis mommy = new PrayingMantis("Green");
		
		
		System.out.println(baby.equals(mommy));
		
	}

}

class BabyPrayingMantis extends PrayingMantis {
	public BabyPrayingMantis() {
		super("Green");
	}
}
