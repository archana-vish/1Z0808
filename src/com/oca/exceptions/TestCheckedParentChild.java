package com.oca.exceptions;

public class TestCheckedParentChild {
	
	public void run() {
		try {
			split();
		} catch (Sub2 s1) {
			
		} catch (Sub1 e) {
			
		}
	}
	
	private void split() throws Sub2 {}

	public static void main(String... args) {
		new TestCheckedParentChild().run();
	}

}


class Sub1 extends Exception {}

class Sub2 extends Sub1 {}