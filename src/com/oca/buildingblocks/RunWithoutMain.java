package com.oca.buildingblocks;

public class RunWithoutMain {
	public static long  main(String... strings) {
		System.out.println("Aha this never runs but results in an Error");
		return 0L;
	}
}
