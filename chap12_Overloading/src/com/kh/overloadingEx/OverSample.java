package com.kh.overloadingEx;

public class OverSample {

	public int sum(int a, int b, int c) {
		return a + b;
	}

	public double sum(double a, double b, double c) {
		return a + b + c;
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public double sum(double a, double b, double c, double d) {
		return a + b + c + d;
	}

	public static void main(String[] args) {
		OverSample obj1 = new OverSample();
		
		System.out.println(obj1.sum(10, 20));
		System.out.println(obj1.sum(10.1, 10.2, 10.3));
		System.out.println(obj1.sum(10, 20, 30));
		System.out.println(obj1.sum(10.1, 10.2, 10.3, 10.4));
		System.out.println(obj1.sum(10, 20, 30, 40));

	}

}
