package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexme {
	public static void main(String[] args) {
		// 정수 두 개를 입력받아 두 수의 합 차 곱 나누기 한 몫과 나머지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.print("첫 번째 숫자를 입력해주세요: ");
		a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력해주세요: ");
		b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " * " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		System.out.println(a + " % " + b + " = " + (a%b));
		
	}

}
