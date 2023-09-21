package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PracticeMain4 {

	public static void main(String[] args) {
		PracticeMain4 run = new PracticeMain4();
		run.practice4();

	}

	public void practice1() {
		String name = "KH";
		int age = 25;
		String formatString = String.format("이름 : %s, 나이 : %d", name, age);
		System.out.println("이름");
	}

	public void practice2() {
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("현재 날짜: %s", smDateFormat.format(currentDate));
		System.out.println(formatStr);

	}

	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		// 숫자 앞에 0을 넣어주고 싶으면 %0d;
		// 숫자를 5자리로 만들어 주고 싶다 %05d;
		String formatString = String.format("숫자 1: %d, 숫자 2: %d", num1, num2);
		System.out.println(formatString);
		// String 변수명 = String.format()
	}
	
	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		// 10은 최소 너비 최소 10자리의 공간을 차지
		// 만약 문자열이 10자리보다 짧다면 왼쪽에 공백으로 채워짐
		// 만약 문자열이 10자리 보다 짧다면 오른쪽에 공백으로 채워짐
		// 작은 따움표 ('') 로 둘러 쌓아야함
		String formatStr = String.format("'%-10s' '%10s'",text1, text2);
		System.out.println(formatStr);
	}
}
