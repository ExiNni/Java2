package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
			문자열을 입력받아서 문자 하나하나 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와
			몇 번 째 인덱스에 위치하는지 인덱스 출력하기
			
			1. 문자열을 입력 받아
			2. 문자 하나하나 배열에 넣고
			3. 검색할 문자 Scanner
			4. 문자열에 몇 개 들어가 있는지 개수와
			5. 몇 번째 인덱스에 위치하는지
			6. 인덱스 출력하기
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String input = sc.next();
		
		System.out.println("검색할 문자를 입력하세요: ");
		char search = sc.next().charAt(0);
		
		char[] charString = input.toCharArray();
		
		int charCount = charString.length;
		System.out.println("charCount: " + charCount);
		
		int count = 0;
		
		System.out.println(input + " 에 " + search + " 가 존재하는 위치 (인덱스)");
		
		for(int i = 0; i <= charCount; i++) {
			//만약에 내가 이 문자를 검색했을 때 이 문자는 몇 번째 인덱스에 위치하는지 인덱스 출력하기
			if(charString[i] == search) { 
				// charString[i]가 고정값이 아니라 i인 이유는 searchChar 우리가 검색해서 문자값을 지정해 주기 때문에 
				//문자 배열이 내가 검색한 문자와 일치하는지
			}	count ++;
		}
	
		
		
		/*
		 	문자열을 문자로 반환 = "안녕하세요" -> "안" "녕" "하" "세" "요"
		 	String -> char
		 	toCharArray -> 문자열을 문자 배열로 변환하는 역할
		 	
		 	검색할 문자가 문자열에 몇 개 들어가 있는지 개수 (length) 
		 	몇 번째 인덱스에 위치하는지 인덱스 출력
		 	
		 	총 길이가 얼마나 되는지 확인하고, 각 자리값 출력하기
		*/
	}
}
