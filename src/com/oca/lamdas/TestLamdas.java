package com.oca.lamdas;

public class TestLamdas implements TestNumber  {
	
	
	public static void main(String...strings) {
		TestLamdas testLamdas = new TestLamdas();
		int result = 0;
		//testLamdas -> { testLamdas.sum(5, 4) } ;
		
		System.out.println(result);
		testLamdas.alwaysTheSame();
		//TestNumber.alsoPossibleStatics();
		
	}

	public int sum(int a, int b) {
		if (checkNumber(a) && checkNumber(b)) {
			return a+b;
		} else {
			return 0;
		}
	}
	@Override
	public boolean checkNumber(int num) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void alwaysTheSame() {
		System.out.println("Default method now overridden");
	}
	
	public static void alsoPossibleStatics() {
		System.out.println("Now in main class");
	}
}
