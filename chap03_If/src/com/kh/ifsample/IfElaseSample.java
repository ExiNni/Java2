package com.kh.ifsample;

public class IfElaseSample {

	public static void main(String[] args) {
		
		int age = 60;
		
		if(age >= 60) {
			System.out.println("환갑잔치를 할거야!"); // 60 보다 크거나 같으면 실행
		}else {
			System.out.println("아직 멀었네...!"); // 60 보다 작으면 실행
		}
		
		int temp = 21;
		if (temp >= 25) {
			System.out.println("더운 날씨가 예상됩니다.");
		}else {
			System.out.println("적당한 날씨로 예상됩니다.");
		}
	}
}
