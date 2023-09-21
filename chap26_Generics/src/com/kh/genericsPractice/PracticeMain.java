package com.kh.genericsPractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T 사용하여 출력
		PracticeMain pm = new PracticeMain();
		pm.practice1();

	}
	public void practice1() {
		//정수형 데이터를 저장하는 ArrayList
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//문자열 데이터를 저장하는 ArrayList
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("World");
		
		//제너릭 메서드를 사용해서 요소 출력
		printList(intList);
		printList(strList);

	}
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}

	public void practice2() {
		// Box 객체를 com.kh.genericspractice; 밑에 생성
		// 정수형 데이터를 저장하는 Box 인스턴스 생성
		// 문자열 데이터를 저장하는 Box 인스턴스 생성
		// 각 각 출력
		
	}
	
}