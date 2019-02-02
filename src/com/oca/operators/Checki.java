package com.oca.operators;

public class Checki {
	
	public void postIncremementI() {
		for (int i = 0; i < 10; ) {
			//i = i++;
			i++;
			System.out.format("%d hello world", i);
			System.out.println();
		}
	}
	
	public void postIncrementJ() {
		int j = 1;
		for (int i = 0; j<3; ++i) {
			j = j++;
			System.out.println(i+j);
		}
	}
	
	public static void main(String...strings ) {
		Checki checkI = new Checki();
		//checkI.postIncremementI();
		checkI.postIncrementJ();
	}
	
	

}
