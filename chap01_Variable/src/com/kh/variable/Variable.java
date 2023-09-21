package com.kh.variable;

public class Variable {
	public static void main(String[] args) {
		// 1. 변수의 이름은 영문자와, 숫자, 언더스코어, 달러로 구성할 수 있다.
		// 2. 변수의 이름은 숫자로 시작할 수 없다.
		// 3. 변수 이름 사이에는 공백을 포함할 수 없다.
		// 언어의 규칙으로 띄어쓰기는 무언가 새로 시작할 때 사용하기 때문에 사용하지 않는다.
		// 4. 자바에서 미리 예약한 변수 이름으로 사용하지 못한다.
		
		//실수형 (float, double)
		float pie1 = 3.1411231242f; // float는 뒤에 f나 대문자 F를 작성해준다.
		double pie2 = 3.1411231242;
		System.out.println("float : " + pie1);
		System.out.println("double : " + pie2);
		
		// byte : 바이트는 -128 ~ 127까지 사용가능
		// byte bt = -129; // int 로 변경하거나 값을 나누어서 넣어줘야함 - byte + byte
		byte bt = 127; // -129 와 128 이상부터 출력이 되지 않는 것 확인
		System.out.println(bt);
		
		// short = -32,768 ~ 32,767 까지 사용가능
		// short shrt = -32769; // -32,769와 32,768 이상은 출력되지 않음
		short shrt = -32767;
		System.out.println(shrt);
		
		// int = -2,147,483,648 ~ 2,147,483,647 까지 허용 가능
		int nt = -2147483648;
		System.out.println(nt);
		
		// long = -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long lng = 20000L; // 뒤에 대문자 L 이나 소문자 l을 붙혀준다.
		System.out.println(lng);
		
		// char : 문자형 글자를 한글자만 포함할 수 있음
		// ''; 만 사용 가능
		char chr1 = 'a';
		System.out.println(chr1);
		
		// String은 기본적인 자료형에 들어가지는 않으나 기본적으로 사용됨.
		// 기본적인 자료형에 들어가지 않기 때문에 String 으로 표현됨.
		// String ""이나 '' 안에 글자로 작성할 것
		String name = "안녕하세요";
		System.out.println(name);
		
		// boolean은 true 와 false를 표현한다.
		// 사용방법: boolean bln = true; | false;
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false;
		System.out.println(bln2);
		
		System.out.println("안녕하세요. 저는 홍길동 입니다.");
		String name1 = "홍길동";
		System.out.println("안녕하세요. 저는 " + name1 + " 입니다.");
		// 한 번 타입을 선언한 변수는 재선언을 하지 않고 그대로 사용해도 된다.
		// 한 번 타입을 선언한 타입을 다은 타입으로 재선언 할 수 없다.
		// 선언한 타입을 다른 타입으로 변경해서 선언할 수 없다.
		name1 = "박철수";
		System.out.println("안녕하세요. 저는 " + name1 + " 입니다.");
		
		int age = 22;
		String baseball = "야구";
		System.out.println("안녕하세요. 저는 " + name1 + " 입니다.");
		System.out.println("저의 나이는 " + age + "살 이고,");	
		System.out.println("저의 취미는 " + baseball + "입니다.");
		
		char score = 'a';
		System.out.println("저의 성적은 " + score + "입니다");
	}
}
