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
	System.out.println("�л��� �г���: " +  grade + "�г�, " + " ����: " +
			classroom + "��, " +" �̸���: " + name + ", Ű��: "
			+ height + "cm" +", ������: " + gender + "��" + "�Դϴ�.");
	
	}
	
}