package com.kh.abstractSample;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("Red", 5.0);
		System.out.println("Circle Area: " + circle.calculatorArea());
		System.out.println("Circle Color: " + circle.getColor());
		
		// Rectangle r = new Rectangle
		Rectangle rectangle = new Rectangle("blue", 5.0, 4.8);
		System.out.println("Circle Area: " + rectangle.calculatorArea());
		System.out.println("Circle Color: " + rectangle.getColor());
	}

}
