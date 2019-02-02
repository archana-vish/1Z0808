package com.oca.exceptions;

import java.io.IOException;

public class Supper {
	
	public static void eat() throws IOException {
		try {
			System.out.println("1");
			throw new IOException();
		} catch(IOException e) {
			//try {
			System.out.println("2");
			throw e; 
			/*} catch (Exception e1) {
				System.out.println("2.5");
			}*/
		} finally {
			System.out.println("3");
		}
	}
	
	public static void main(String...strings) throws Exception {
		eat();
		System.out.println("4");
	}

}
