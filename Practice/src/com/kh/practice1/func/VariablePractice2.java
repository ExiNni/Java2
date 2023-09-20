package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("첫 번째 정수를 입력하세요: ");
		a = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요: ");
		b = sc.nextInt();
		
		System.out.println("더하기 결과: " + (a + b));
		System.out.println("빼기 결과: " + (a - b));
		System.out.println("곱하기 결과: " + (a * b));
		System.out.println("나누기 결과: " + (a / b));
		System.out.println("나누기 몫 결과: " + (a % b));
	}

}
