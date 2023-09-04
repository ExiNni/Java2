package com.kh.example.pracitce2.model.vo;

public class Student {

	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	public Student(int grade, int classroom, String name, 
			double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
		
	
		
	}
public void information() {
	System.out.println("학생의 학년은: " +  grade + "학년, " + " 반은: " +
			classroom + "반, " +" 이름은: " + name + ", 키는: "
			+ height + "cm" +", 성별은: " + gender + "자" + "입니다.");
	
	}
	
}
