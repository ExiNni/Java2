package com.kh.variable;

public class VariableConversion {

	public static void main(String[] args) {
		// 1. 자동형변환(암시적형변환, 묵시적형변환)
		int intNum = 100;
		long longNum = intNum; //int를 long 으로 자동 형변환
		
		System.out.println(intNum);//숫자 100을 의미;
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float를 double로 자동 형변환
		
		System.out.println(floatNum);
		System.out.println(doubleNum);
		
		// int -> long 변경하는 형변환 2가지 만들고 출력하기
		
		// short -> int 로 변경하는 형변환 1가지 만들고 출력하기
		
		// float -> double 로 변경하는 형변환 1가지 만들고 출력하기
		
		int intA = 12345;
		long longA = intA;
		
		int intB = 67890;
		long longB = intB;
		
		System.out.println(intA);
		System.out.println(longA);
		
		System.out.println(intB);
		System.out.println(longB);
		
		short shortC = 100;
		int intC = shortC;
		
		System.out.println(shortC);
		System.out.println(intC);
		
		float floatD = 123.456f;
		double doubleD = floatD;
		
		System.out.println(floatD);
		System.out.println(doubleD);
		
		// 2. 명시적 형변환(강제 형변환)
		
		// long -> int
		long largeLong = 123456789012345L;
		System.out.println("largeLong :" + largeLong);
		int largeInt = (int) largeLong;
		System.out.println("largeInt : " + largeInt); 
		// long을 int로 강제 형변환 할 경우 값이 범위 안에 있지 않으면 일부 데이터는 손실된다.
		
		double largeDouble = 12345.6789;
		int intPart = (int) largeDouble;
		System.out.println(intPart); // 실수를 int로 강제 형변환시 정수로만 표현
		
		// 문자와 숫자간의 형변환 2개 출력
		// 문자는 char charValue = 'Z'; -> int로 변경
		char charBalue = 'Z';
		char charB = 'B';
		int int_Balue = charBalue;
		int int_B = charB;
		System.out.println("int_Balue: " + int_Balue);
		System.out.println("int_B: " + int_B);
	
		// double -> int로 형변환 1개 출력
		double double_B = 123.456;
		int int_C = (int) double_B;
		System.out.println("int_C: " + int_C);
		
		//int를 short로 형변환 1개 출력
		int int_D = 10;
		short short_D = (short)int_D;
		System.out.println("short_D: " + short_D);
	}

}
