package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3개 이상 문자열을 입력하세요: ");
		String word = sc.next();
		
		// 한자리씩 보기 때문에 apple 1자가 넘어가 출력을 할 수 없음
		// 자리 위치 정해서 출력하기
		char a1 = word.charAt(0); // 문자를 1자씩 읽음
		char a2 = word.charAt(1);
		char a3 = word.charAt(2);
		
		System.out.println("첫 번째 문자: " + a1);
		System.out.println("두 번째 문자: " + a2);
		System.out.println("세 번째 문자: " + a3);
		
		String p1 = word.substring(0,4); // 단어 하나가 아니라 여러개 출력 가능
		System.out.println(p1);
		
	}

}
