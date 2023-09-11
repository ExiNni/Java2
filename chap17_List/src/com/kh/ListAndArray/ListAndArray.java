package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {
	public static void main(String[] args) {
		// Array 예제
		int[] intArray = new int[2]; // 크기가 5인 정수 배열 생성
		intArray[0] = 1;
		intArray[1] = 2;
		
		// Array 출력
		System.out.println("Array 요소 : ");
		for(int a = 0; a < intArray.length; a++) {
			System.out.println(intArray[a] + " ");
		}
		
		System.out.println(); // 개행문자 포함되어 있어 enter같은 역할을 함
	
		// List 예제
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		// List 출력
		System.out.println("List 요소: ");
		for(int num : intList) {
			System.out.println(num + " ");
		}
	}

}
