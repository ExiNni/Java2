package com.kh.exceptionPractice;

public class PractceMain {
	public static void main(String[] args) {
		PractceMain run = new PractceMain();
		//run.ArithException();
		//run.NullPointException();
		//run.NumFormatException();
		run.ExceptionExam();
	}
	public void ArithException() {
		// int dividend / divisor 나누엇을 때 예외처리
		int dividend = 100;
		int dicvisor = 0;
		
		try {
			System.out.println("dividend / dicvisor  = " + dividend / dicvisor);
		} catch(ArithmeticException e) {
			System.out.println("나눌 수 없습니다. " + e.getMessage());
		}
		
		
	}
	
	public void NullPointException() {
		String text = "Hello World";
		String subText = null;
		
		try {
			int length = text.indexOf(subText); // indexOf는 subText안에 있는 null 값을 포함한 문자열 검색
			System.out.println(length); 
		} catch(NullPointerException e) {
			System.out.println("subText를 확인해주세요 : " + e.getMessage());
		}
		
		
		
	}
	public void NumFormatException() {
		
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println(text);
		} catch(NumberFormatException e) {
			System.out.println("다시 확인해주세요: " + e.getMessage());
		}
		
	}
	
	public void ExceptionExam() {
		
		try {
			int[] numbers = {1,2,3,4,5};
			int index = 7; // 유효하지 않은 인덱스 넘버
			int result = numbers[index]; // 배열 요소에 접근
			System.out.println("Result : " + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			// 배열 인덱스가 범위를 벗어났을 떄 발생하는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어나 예외가 발생!" + e.getMessage());
		} catch(Exception e) {
			// 다른 예외를 처리할 수 있는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생" + e.getMessage());
		} finally {
			// 항상 실행되는 블록
			System.out.println("Finally 등장!");
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}
}