package com.kh.classSample;

public class Student {
	
	String name;
	int age;
	String grade;
	
	/**************생성자 / 생성자는 메서드 중 일부***************/
	
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		
	}
	// 학생 정보 출력 메서드
	public void displayInfo() {
		System.out.println("학생의 이름은: " + name);
		System.out.println("학생의 나이는: " + age);
		System.out.println("학생의 학년은: " + grade);
	}
}
