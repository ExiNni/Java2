package com.kh.arraysample;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/*
			1. 배열의 길이를 선언
			1 ~ 10 까지의 반복문을 이용해서 순서대로배열 인덱스에 넣은 후 그 값을 출력
			
		*/
		
		/*
		int[] num = new int[10]; // 길이가 3인 배열 선언
		
		for(int i = 0; i < num.length; i++) {
			// 순서대로 배열 인덱스에 값을 넣은 후
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		for(int j = 0 ; j < num.length; j++) {
			System.out.println(num[j]);
		}
		*/
		
		
		/*
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하기
		int[] num1 = new int[10];
		
		for(int i = 0; i < num1.length; i++) {
			num1[i] = i + 1;
		}
		for(int i = num1.length - 1; i >= 0; i--) {
			System.out.println("num1[" + i + "] = " + num1[i]);
		}
		*/
		
		/*
		int[] numbers = new int[10];
		int value = 10;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = value--;
			System.out.println("numbers [" + i + "] = " + numbers[i]);
		}
		*/
		
		// 길이가 5인 String 배열 선언
		// 사과 귤 포도 복숭아 참외로 초기화 한 후
		// 배열 인덱스를 활용해서 귤을 출력하기
		
		/*
		String []fruit = new String [5];
		Scanner sc = new Scanner(System.in);
		
		fruit[0] = "사과";
		fruit[1] = "귤";
		fruit[2] = "포도";
		fruit[3] = "복숭아";
		fruit[4] = "참외";
		

		for(int i = 0; i < fruit.length; i++) {
			fruit[i] = sc.next();
			System.out.print("번호를 입력해주세요: ");
		}
		for(int i = 0; i < fruit.length; i++) {
			fruit[i] = sc.next();
		System.out.println("fruit " + i + ": " + fruit[i] );
		}
		*/
		
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println("배열 인덱스 1의 값: " + fruits[1]);
		
	}
}
