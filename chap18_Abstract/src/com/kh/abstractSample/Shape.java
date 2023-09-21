package com.kh.abstractSample;

// 추상클래스 정의
abstract class Shape {
	// 일반 필드
	private String color;

	// 추상 메서드 (하위 클래스에서 구현해야 함)
	abstract double calculatorArea();
	

	// 생성자
	public Shape(String color) {
		this.color = color;
	}

	// 일반 메서드 (메서드는 return or void 가 있어야함)
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public static void main(String[] args) {
	}

}
