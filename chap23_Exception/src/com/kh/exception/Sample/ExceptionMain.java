package com.kh.exception.Sample;

public class ExceptionMain {
	public static void main(String[] args) {
		ExceptionMain run = new ExceptionMain();
		run.ExceptionC();
		
	}
	
	public void ExceptionA() {
		try {
			int result = 10 / 0; // 0 으로 나누는 시도
			System.out.println("result: " + result);

		} catch(ArithmeticException e) {
			/*
				ArithmeticException 수학적인 계산 과정에서 발생하는 오류
				ArithmeticException e : e는 우리가 지정한 변수명
				e로 지정한 변수로 메세지를 getMessage() 로 전달받는다.
			*/
			System.out.println("산술 연산으로 인해 발생한 에러!!" + e.getMessage());
		}
	}
	
	public void ExceptionB() {
		
		try {
			String text = null;
			int length = text.length(); // 내용이 없는데 text 로 부터 길이를 얻기
			System.out.println("text의 길이: " + length);
		}catch (NullPointerException e) {
			System.out.println("출력할 수 없습니다." + e.getMessage());
		}
	}
	public void ExceptionC() {
		try {
			String juminNumber = "팔오공904";
			int number = Integer.parseInt(juminNumber); // 문자열을 정수로 변환 시도
			System.out.println("숫자: " + number); // 안에 String 이 들어있기 때문에 실행이 되지 않는다
		} catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다. " + e.getMessage());

		}
		
	}

}
