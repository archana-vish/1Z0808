package com.oca.exceptions;

public class ArithmeticExceptions {
	
	public static void main(String...strings ) {
		try {
			//System.out.println(3/0);
			//System.out.println(-3/0);
			//System.out.println(0/0);
			
			
			System.out.println(3.0/0);
			System.out.println(-3.0/0.0);
			System.out.println(0.0/0);
			System.out.println(0.0/0.0);
			
			int a = 10;
			int y = a++;
			int z = y--;
			System.out.println(a + " " + y + " " + z);
			int x1 = a- 2*y - z; // 11-2*9-10
			System.out.println(x1);
			int x2 = a - 11;
			double x3 = x2;
			
			double x = x1/x3;
			
			System.out.println(x);
			System.out.println(x1);
			System.out.println(x3);
			
			int[] nums = new int[5];
			nums = new int[]{1,2,3,4};
			int x4 = --nums[1] + --nums[0] ; ///nums[0] * nums[4];
			System.out.println(x4);
			
			System.out.println(-0.0/0.0);
			
			double zeros = -3.2/0;
			
			System.out.println(zeros);
			
		} catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}

}
