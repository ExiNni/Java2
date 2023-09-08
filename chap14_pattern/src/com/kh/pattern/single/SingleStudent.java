package com.kh.pattern.single;

public class SingleStudent {
	private String name;
	
	private SingleStudent() {
		// 생성자
	}
	
	public void display() {
		System.out.println("싱글톤 학생입니다.");
	}

	public static void main(String[] args) {
		SingleStudent std1 = new SingleStudent();
	}
}
