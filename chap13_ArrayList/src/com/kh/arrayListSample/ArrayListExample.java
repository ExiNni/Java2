package com.kh.arrayListSample;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		// 빈 ArrayList 생성
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println("fruits: " + fruits);
		
		fruits.add("사과");
		System.out.println("사과 추가: " + fruits);
		fruits.add("바나나");
		System.out.println("바나나 추가: " + fruits);
		fruits.add("딸기");
		System.out.println("딸기 추가: " + fruits);

		// 요소 개수 확인
		int size = fruits.size();
		System.out.println("과일 목록의 크기 : " + size);
		
		// 인덱스를 사용하여 요소에 접근하자
		String firstFruits = fruits.get(0);
		System.out.println("첫 번재 과일: " + firstFruits);

		
		// 요소 수정
		fruits.set(2, "체리");
		System.out.println("수정 체크: " + fruits);
		
		//요소 제거
		fruits.remove(1);
		System.out.println("제거 체크 : " + fruits);
		
		// ArrayList 순회해서 요소 출력
		System.out.println("모든 과일 목록");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// ArrayList 비우기
		fruits.clear();
		System.out.println("모든 과일을 제거 " + fruits);
	}

}
