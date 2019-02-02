package com.oca.equalsAndDoubleEqualTo;

public class TestEqualsForObject {
	
	public static void main(String...strings ) {
		Bird b = new Sparrow();
		Sparrow s = new Sparrow();
		Sparrow s1 = new Sparrow();
		
		s1 = s;
		
		if (b == s) { System.out.println("=="); }
		
		if (b.equals(s)) {
			System.out.println("bird");
		}
		if (s.equals(s1)) {
			System.out.println("sparrow");
		}
		
		if (s1 == s) {
			System.out.println("Also ==");
		}
	}

}

class Sparrow extends Bird {
	
}
 abstract class Bird {}


