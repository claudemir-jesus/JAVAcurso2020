package Util;

public class Calc {

	public static final double PI = 3.14159;
	
	public static double circo (double radius) {
		return 2.0 * PI * radius;
		
	}
	public static double vol (double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
