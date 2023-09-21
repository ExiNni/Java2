package com.kh.pattern.MVC;

import com.kh.pattern.MVC.Model.StudentModel;
import com.kh.pattern.MVC.controller.StudentController;
import com.kh.pattern.MVC.view.StudentView;

public class StudentClient {
	/*
		MVC 패턴을 사용해서 학생정보를 다루는 곳
	*/
	public static void main(String[] args) {
		// 모델 객체 생성 Model
		StudentModel stdmodel = new StudentModel("박학생", 17);
		// 뷰 객체 생성 View
		StudentView stdView = new StudentView();
		// 컨트롤러 객체 생성 Controller (모델 뷰 설정)
		StudentController cntl = new StudentController(stdmodel, stdView);
		// 학생 정보를 업데이트 해서 출력
		cntl.updateView();
		// 학생 정보 업데이트를 하자!
		cntl.setstudentName("이업데이트");
		cntl.setstudentAge(18);
		// 업데이트 된 학생 정보를 출력
		cntl.updateView();
	}

}
