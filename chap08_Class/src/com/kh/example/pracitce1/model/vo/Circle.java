package com.kh.example.pracitce1.model.vo;

public class Circle {

	double pi = 3.14;
	int radius = 1;
	
public Circle() {
	// 아무런 초기화를 하지 않음
}
	
public void incrementRadius() {
	int radius2 = 2 * radius;
	System.out.print("반지를을 더한 넓이: ");
	System.out.println((pi * (radius2 * radius2)));
	
	}
public void getAreaOfCircle() {
	System.out.print("원의 넓이: ");
	System.out.print((pi * (radius * radius)));
	System.out.println();
}
public void getSizeOfCircle() {
	System.out.print("원의 둘레: ");
	System.out.print((2 * pi * radius));
	System.out.println();
}
}
