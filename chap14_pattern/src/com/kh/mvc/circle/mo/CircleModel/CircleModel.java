package com.kh.mvc.circle.mo.CircleModel;

public class CircleModel {

	private int radius;
	private double PI;

	public int getRadius() {
		return radius;
	}

	public double getPI() {
		return PI;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setPI(double PI) {
		this.PI = PI;
	}
	
	public CircleModel(int radius, double PI) {
		this.radius = radius;
		this.PI = PI;
	}

}
