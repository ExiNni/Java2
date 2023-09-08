package com.kh.pattern.MVC.controller;

import com.kh.pattern.MVC.Model.StudentModel;
import com.kh.pattern.MVC.view.StudentView;

public class StudentController {

	private StudentModel studentmodel;
	private StudentView studentview;

	public StudentController(StudentModel studentmodel, StudentView studentview) {
		this.studentmodel = studentmodel;
		this.studentview = studentview;
	}

	public void setstudentName(String name) {
		studentmodel.setName("ȫ�浿");
	}

	public void setstudentAge(int age) {
		studentmodel.setAge(20);
	}

	public String getStudentName() {
		return studentmodel.getName();
	}

	public int getStudentAge() {
		return studentmodel.getAge();
	}

	public void updateView() {
		studentview.displayInfo(studentmodel.getName(), studentmodel.getAge());
	}
}
