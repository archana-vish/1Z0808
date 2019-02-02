package com.oca.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckNested {
	
	static FileInputStream players, coach;
	
	public static void main(String...strings ) {
		try {
			players = new FileInputStream("./players.txt");
			System.out.println("players.txt found");
			try {
				coach.close();
			} catch (IOException ioe) {
				System.out.println("coach not found");
			}
		} catch(FileNotFoundException fnfe) {
			System.out.println("Outer loop");
		} catch (NullPointerException npe) {
			System.out.println("Npe");
		}
		
	}
	

}
