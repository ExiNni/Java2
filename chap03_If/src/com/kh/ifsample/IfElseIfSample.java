package com.kh.ifsample;


public class IfElseIfSample {

	public static void main(String[] args) {

		/*
			if-else if-else
				여러 개의 조건을 연속적으로 평가
				그 중 첫 번째 참인 조건에 해당하는 코드 블록을 실행하는 구조
				만약 if나 else if 의 조건도 참이 아니라면 마지막 else 블록 실행
				
				if(조건1){
					// 조건1이 참일 때 실행 되는 코드
					}else if{
					// 조건 2가 참일 때 실행 되는 코드
					}else{
					// 위의 모든 조건이 거짓일 때 실행되는 코드
					}
		*/
		
		int age = 28;
		
		if(age == 20) {
			System.out.println("나는 해외 여행을 갈거야");
		}else if (age > 20){
			System.out.println("나는 세계 여행을 갈거야");
		}else  {
			System.out.println("나는 집에만 있을거야");
		}
		
		
		
		int score = 85;
		if( score > 90) {
			System.out.println("A");
		}else if ( score == 90) {
			System.out.println("B+");
		}else {
			System.out.println("B");
		}
		
		int hour = 15;
		if (hour < 12) {
			System.out.println("좋은 아침입니다.");
		}else if (hour < 18) {
			System.out.println("열심히 코딩합시다!!");
		}else {
			System.out.println("수고하셨습니다.");
		}
		
		// 날씨 체크
		int temp = 28;
		if (temp > 30) {
			System.out.println("더운 날씨입니다.");
		}else if (temp > 20) {
			System.out.println("적당한 날씨입니다.");
		}else {
			System.out.println("추은 날씨입니다");
		}
		
		int number = -5;
		if (number > 0) { // 0 보다 클 때 참 (true)
			System.out.println("양수입니다.");
		}else if (number == 0){ // 0 일 때 (true)
			System.out.println("0 입니다.");
		}else { // 0 보다 작을 때 (true)
			System.out.println("음수입니다.");
		}
		
		int myAge = 15;
		if (myAge > 19) {
			System.out.println("성인입니다");
		}else if(myAge > 12) {
			System.out.println("청소년 입니다.");
		}else {
			System.out.println("어린이 입니다.");
		}
		
		// 계절 출력하기
		int month = 8;
		int temp1 = 40;
		if (month == 1 || month == 2 || month == 12) {
			System.out.println("겨울입니다.");
			if ( temp1 < 0) {
				System.out.println("한파 주의보입니다.");
			}
		}else if ( month >= 3 && month <= 5) {
			System.out.println("봄입니다.");
			if( temp1 >= 0 && temp1 <= 15) {
				System.out.println("쌀쌀한 날씨입니다.");
			}
		}else if (month >= 6 && month <= 8) {
			System.out.println("여름입니다.");
			if(temp1 > 30) {
				System.out.println("폭염주의보입니다.");
			}
		}else if (month >= 9 && month <=11){
			System.out.println("가을입니다.");
			if(temp1 >= 0 && temp1 <= 15) {
				System.out.println("쌀쌀한 날씨입니다.");
			}
		}else {
			System.out.println("없는 계절입니다.");
		}
			
			
		
	}

}
