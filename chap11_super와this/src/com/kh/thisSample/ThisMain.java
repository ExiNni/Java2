package com.kh.thisSample;


		/*
			this 객체 (=인스턴스) 자신을 가르키는 참조변수 객체(=인스턴스)의 주소가 저장
			this() 현재 클래스의 다른 생성자를 호출하는데 사용
		*/

class MyClass {
	int myField;
	
	MyClass(){
		this(0); // this() 사용해서 다른 생성자 호출
	}
	MyClass(int value){
		this.myField = value;
	}
	void printValue() {
		System.out.println("myField의 값: " + this.myField);
	}
}

public class ThisMain {
	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); // 첫 번째 생성자 호출
		MyClass obj2 = new MyClass(10); // 두 번째 생성자 호출
		
		obj1.printValue();
		obj2.printValue();
		
	}
}
