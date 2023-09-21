package com.kh.example.practice3.model.vo;

public class Circle {

	private final double PI = 3.14;
	private int radius = 1;

	public int getRadius() {
		return radius;
	}

	public double getPI() {
		return PI;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void increasementRadius() {
		radius++;
		System.out.println(radius);
	}

	public void getAreaOfCircle() {
		System.out.println(2 * (PI * radius));
	}

	public void getSizeOfCircle() {
		System.out.println((PI * radius * radius));
	}

}
