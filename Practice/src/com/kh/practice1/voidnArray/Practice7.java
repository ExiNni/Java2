package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class Practice7 {
	/*
	 * 계산기 만들기 (연산 결과 반환):
	 * 
	 * 메서드 이름: calculate
	 * 
	 * 매개변수: 두 개의 실수(double 타입) num1과 num2, 그리고 연산자(String 타입) operator 기능: num1과
	 * num2를 operator에 따라 더하기, 빼기, 곱하기, 나누기 연산을 수행하고 결과를 반환함.
	 * 
	 */
	public static void calculator() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 숫자: ");
		double num1 = scanner.nextInt();

		System.out.print("연산자 (+, -, *, /): ");
		char operator = scanner.next().charAt(0);

		System.out.print("두 번째 숫자: ");
		double num2 = scanner.nextInt();

		double result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			return;
		}

		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}