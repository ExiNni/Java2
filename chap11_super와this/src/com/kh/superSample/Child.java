package com.kh.superSample;
// 상속 받아서 super() super. 차이점 확인
/*
	super = 부모 클래스의 변수나 메서드에 접근하기 위해 사용
	super() = 부모 클래스의 생성자를 호출하기 위해 사용 서브클래스의 생성자에서 첫 번째 줄에 호출 되어야 함
	
*/
//           자식   상속받는다  부모
public class Child extends Parent{
	// Child() 만 쓰면 접근제한자가 default로 변경된 것일 뿐 public이랑 쓰임은 똑같음
	public Child(){
		super(); // 부모 클래스의 기본 생성자 호출
		System.out.println("자식 클래스의 기본 생성자입니다.");
	}
	
	public Child(String name) {
		super(name); // 부모 클래스의 문자열 파라미터 생성자 호출
		System.out.println("자식 클래스의 문자열 파라미터 생성자입니다.");
	}
	
	public void display() {
		super.show(); // 부모 클래스의 show 출력 메서드 호출
		System.out.println("자식 클래스의 display 메서드 입니다.");
	}
}
