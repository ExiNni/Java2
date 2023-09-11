package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray_String {
	public static void main(String[] args) {
		// Array 예제
		String[] StringArray = new String[2]; // 크기가 5인 정수 배열 생성
		StringArray[0] = "홍길동";
		StringArray[1] = "이순신";
		
		// Array 출력
		System.out.println("Array 요소 : ");
		for(int a = 0; a < StringArray.length; a++) {
			System.out.println(StringArray[a] + " ");
		}
		
		System.out.println(); // 개행문자 포함되어 있어 enter같은 역할을 함
	
		// List 예제
		List<String> StringList = new ArrayList<>();
		StringList.add("홍길동");
		StringList.add("이순신");
		StringList.add("강감찬");
		
		// List 출력
		System.out.println("List 요소: ");
		for(String num : StringList) {
			System.out.println(num + " ");
		}
	}

}
