package com.oca.override;

public class FloatOrDouble {
	
	static float floatDefault;
	static double doubleDefault;
	public void printVal(float f) {
		System.out.println("Printing float :: " + f);
	}

	public void printVal(double d) {
		System.out.println("Printing double :: " + d);
	}

	public static void main(String... strings) {
		System.out.println("Float :: " + floatDefault + " Double :: " + doubleDefault);
		FloatOrDouble floatOrDouble = new FloatOrDouble();
		floatOrDouble.printVal(1.2);
		floatOrDouble.printVal(1.0);
		floatOrDouble.printVal(2.33f);
		floatOrDouble.printVal(0);
		Math.pow(3, 3);
		//floatOrDouble.printVal(Nan);
	}
}
