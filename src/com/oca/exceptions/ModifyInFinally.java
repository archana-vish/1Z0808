package com.oca.exceptions;

public class ModifyInFinally {
	
	public int returnANumber() {
		
		int num = 1;
		try {
			num = 2;
		} catch(Exception e) {
			num = 3;
		} finally {
			num = 4;
		}
		return num;
	}
	
	public static void main(String...strings ) {
		System.out.println(new ModifyInFinally().returnANumber());
	}

}
