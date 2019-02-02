package com.oca.constructors;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base {
	
	public Base() throws IOException {
		System.out.println("Base class");
	}
	
	 public void method1()  {
		System.out.println("Base method1");
	}
}

public class Override extends Base {
	
	private Override() throws Exception {
		System.out.println("Child class");
	}
	
	public void method1() throws RuntimeException  {
		System.out.println("Child class method1");
	}

	public static void main(String...strings ) throws Exception {
		Base b = new Base();
		Override child = new Override();
		String[] test = new String[]{null};
		System.out.println(test[0]);
		
	}
}
