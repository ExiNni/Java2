package com.kh.operator;

import javax.xml.transform.Templates;

public class Ternary {

	public static void main(String[] args) {

		/*
			6. 삼항 연산자
				조건을 평가하고 세 가지 값 중 하나를 반환합니다.
				조건 ? 값1 : 값2 형태로 사용
				
				삼항 = 일항 ? 이항 : 삼항
				
		*/

		// ex) 나이가 20이상은 성인인가 미성년자인가?
		int age = 20;
		// (조건) ? 값1 : 값2 -> 값 1은 조건이 참일 때 출력, 값 2는 조건이 거짓일 때 출력
		String status = (age >= 20) ? "성인" : "미성년자";
		System.out.println("status: " + status);
		
		int score = 85;
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println("시험 결과: " + result);
		
		int number = 5;
		String sign = (-5 > 0) ? "true" : "false";
		System.out.println("sign: " + sign);
		
		int temperature = 25;
		String weather = (temperature > 21) ? "적당한 날씨" : "추운 날씨";
		System.out.println("날씨 상태는: " + weather);
		
		//숫자 7의 값을 짝수인지 홀수인지 출력
		
	int a = 7;
	String b = (a % 2 == 0) ? "짝수 입니다" : "홀수 입니다";
	System.out.println("숫자 7은: " + b);
	
	int number2 = -5;
	String sign2 = (number2 > 0) ? "양수" : (number2 < 0) ? "음수" : "0";
	System.out.println("sign2는: " + sign2);
	
	}

}
