package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		/*
			Array
			같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
			
			동일한 데이터 타입을 가진 여러 값을 한 곳에 저장하고 인덱스를 사용하여 각 값에 접근할 수 있도록 제공
			배열은 프로그램에서 데이터를 보다 효율적으로 저장하고 관리하는데 사용
			데이터의 집합을 쉽게 다룰 수 있도록 도와줌
			
			배열의 구조는: 
				배열 생성 및 초기화
				데이터 타입[] 배열 이름 = new 데이터 타입[크기]
						
			특징: 
				1. 고정된 크기: 생성할 때 크기가 결정되고, 크기가 고정돼어있음 - 생성 후 크기 변경 불가
				2. 같은 데이터 타입: 배열 내에 모든 요소는 동일한 데이터 타입을 가져야 한다
					ex) int 타입의 배열은 모든 요소가 정수여야함
				3. index 기반 접근: 각 배열 요소는 순차적인 인덱스를 가지며 0 부터 시작해서 배열 크기 -1까지 값을 가짐
								  인덱스를 사용해서 특정 위치에 있는 요소 접근 가능
					ex) 배열 크기 = 5로 주었다면 index 는 0 ~ 4
				4. 배열의 길이는(length): 배열의 길이를 알 수 있다.
		*/
		int score1, score2, score3, score4, score5;
		// 만약 score 1000개라면? => 배열 사용
		int[] score = new int[5];
		
		String[] stringArray = new String[4];
		stringArray[0] = "가";
		stringArray[1] = "나";
		stringArray[2] = "다";
		stringArray[3] = "라";
		
		
		String[] nameArray = {"김경난", "김말똥", "홍길동", "박철수", "허허허"};
		// String[] nameArray = {"", "", "", "", ""}; => 자리만 5개 만들어놓기
		

		System.out.println("stringArray: " + stringArray[0]);
		System.out.println("stringArray: " + stringArray[1]);
		System.out.println("stringArray: " + stringArray[2]);
		System.out.println("stringArray: " + stringArray[3]);
		
		
		String[] food = {"치킨", "갈비", "삼겹살", "과자"}; // index 3개 짜리
		int foodLength = food.length;
		System.out.println("food 배열의 길이: " + foodLength);
		
		}

}
