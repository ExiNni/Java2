package com.kh.forsample;

import java.util.Scanner;

public class for01 {

	public static void main(String[] args) {
		/*
			for문은 프로그래밍에서 반복 작업을 수행하기 위해 사용되는 제어구조이다
			특정한 조건이 만족하는 동안 코드 블록을 반복 실행하는데 사용
			대부분의 프로그래밍 언어에서 for문이 가진 구조
			for (초기화; 조건; 증감){
				// 조건식이 참일 경우 반복적으로 실행할 코드
			}
			
			초기화 : 반복문이 시작될 때 한 번만 실행되는 부분으로, 반복 변수를 초기화 하는 역할을 한다.
			
			조건식 : 반복문이 실행될 조건을 검사하는 부분으로 조건이 참일 경우에만 반복코드 블록 실행 후 실행
			
			증감식 : 반복 변수를 증가시키거나 감소시키는 부분으로, 반복 코드를 블록 실행 후 실행  
		*/
		
		for (int i = 1; i <= 5; i++) {
			//조건 i <= 5 참일 경우에 실행되는 공간
			System.out.println(i);
		}
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("i의 값: " + i);
		}
		
		for(int i = 2; i <= 7; i++) {
			System.out.println("i의 값: " + i);
		}
		
		for(int i = 10; i >= 5; i--) {
			System.out.println("i의 값: " + i);
		}
		
		int sum = 0;
		for(int i =1; i <=10; i++) {
			sum += i;
			System.out.println("1부터 10까지의 합: " + sum);
		}
		
		// sum의 합이 1부터 5까지 합으로 출력하기
		
		int sum1 = 0;
		for(int i =0; i <=5; i++) {
			sum1 += i;
		}
		System.out.println("sum: "+ sum1);
		
		int sum2 = 10;
		for(int i = 10; i >= 2; i--) {
			sum2 -= i;
			
		}System.out.println("sum2: " + sum2);
		
		int mul =1;
		for(int i = 1; i <= 9; i++) {
			mul = 2 * i;
			System.out.println("mul의 값은: " + mul);
		}
		
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				mul = i * j;
				System.out.println("mul의 값: " + mul);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print
		("두 번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		
		int result = 0; // 최초 값을 0으로 줍니다.
		for(int i = 0; i < num2; i++) {
			//for 루프를 사용해서 i 변수를 0 부터 num2 미만까지 반복
			//이 루프는 두 번째 숫자인 num2 만큼 반복
			result += num1;
			//result 변수에 num1 값을 더함
			//num2 만큼 num1을 더하는 효과를 줌
		}
		System.out.println(num1 + " * " + num2 + " = " + result);
				
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				mul = i * j;
				System.out.println("구구단: " + mul);
			}
		}
		
		
		
	}
}
