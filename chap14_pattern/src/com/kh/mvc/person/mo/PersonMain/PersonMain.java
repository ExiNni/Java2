package com.kh.mvc.person.mo.PersonMain;

import com.kh.mvc.person.mo.PersonController.PersonController;
import com.kh.mvc.person.mo.PersonModel.PersonModel;
import com.kh.mvc.person.mo.PersonView.PersonView;

public class PersonMain {

	public static void main(String[] args) {

		PersonModel pm = new PersonModel("박학생", 17);
		// 뷰 객체 생성 View
		PersonView pv = new PersonView();
		// 컨트롤러 객체 생성 Controller (모델 뷰 설정)
		PersonController pc = new PersonController(pm, pv);
		// 학생 정보를 업데이트 해서 출력
		pc.updateView();
		// 학생 정보 업데이트를 하자!
		pc.setpersonName("김길동");
		pc.setpersonAge(25);
		// 업데이트 된 학생 정보를 출력
		pc.updateView();
	}

}
