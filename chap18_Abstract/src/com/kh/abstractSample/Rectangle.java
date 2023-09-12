package com.kh.abstractSample;

public class Rectangle extends Shape{
	private double height;
	private double length;
	
	public Rectangle(String color, double height, double length) {
		super(color);
		this.height = height;
		this.length = length;
	}
	
	@Override
	public double calculatorArea() {
		return height * length;

}
}
