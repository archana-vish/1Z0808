package com.oca.buildingblocks;

public class Cardinal {
	
	 int number;
	Cardinal(int number) { this.number = number; }
	public static void main(String...strings ) {
		Cardinal c1 = new Cardinal(5);
		if (c1 != null) {
			Cardinal c2 = new Cardinal(10);
		//	Cardinal c2 = new Cardinal(40);

		} else {
			Cardinal c2 = new Cardinal(20);
		}
		Cardinal c2 = new Cardinal(30);
		System.out.println(c2.number);
		
		double d = 4.;
		System.out.println(d/2.);
	
	}

}
