package com.method_overloading;

class Calculation{
	
	public int add(int a, int b) {
		int result = a + b;
	    return result;
	}
	
	public int add(int a, int b, int c) {
		int result = a + b + c;
	    return result;
	}
	
	public double add(double a, double b) {
		double result = a + b;
	    return result;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Calculation calc = new Calculation();
		int res1 = calc.add(15, 25);
		
		int res2 = calc.add(15, 25, 45);
		
		double res3 = calc.add(12.20, 15.34);
		
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}
}
