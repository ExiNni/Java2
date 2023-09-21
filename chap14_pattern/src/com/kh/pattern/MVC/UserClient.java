package com.kh.pattern.MVC;

import com.kh.pattern.MVC.Model.UserModel;
import com.kh.pattern.MVC.controller.UserController;
import com.kh.pattern.MVC.view.UserView;

public class UserClient {
	public static void main(String[] args) {
		/*
			MVC 패턴을 사용해서 학생 정보를 다루는 곳
		*/
		
		// 모델 객체 생성
		UserModel user = new UserModel("홍길동", 20);
		
		// 뷰 객체 생성
		UserView view = new UserView();
		
		// 컨트롤러 객체 성 및 모델 뷰 설정\
		UserController controller = new UserController(user, view);
		
		// 학생 정보를 업데이트 해서 출력
		controller.updateView();
		
		// 학생 정보 업데이트
		controller.setUserModel("이순신");
		controller.setUserAge(30);
		
		// 업데이트 된 학생 정보 출력
		controller.updateView();

	}

}
