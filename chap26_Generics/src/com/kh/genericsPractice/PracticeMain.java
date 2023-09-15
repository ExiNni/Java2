package com.kh.genericsPractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain run = new PracticeMain();
		// run.practice1();
		run.practice2();
	}
/*
	public void practice1() {

		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);

		ArrayList<String> strList = new ArrayList<>();
		strList.add("사과");
		strList.add("배");
		strList.add("딸기");

		printList(intList);
		printList(strList);

	}
	

	public static <T> void printList(ArrayList<T> a) {
		for (T item : a) {
			System.out.println(item);
		}
	}
	*/
	public void practice2() {
		// Box 객체를 com.kh.genericspractice; 밑에 생성
		// 정수형 데이터를 저장하는 box 인스턴스 생성
		// 문자열 데이터를 저장하는 box 인스턴스 생성
		// 각 각 출력
		// 향상된 for문 이용해서 값 모두 출력

		Box<Integer> intBox = new Box<>();
		intBox.put(1);
		intBox.put(2);
		intBox.put(3);

		int intValue = intBox.get();

		Box<String> strBox = new Box<>();
		strBox.put("사과박스");
		strBox.put("배박스");
		strBox.put("포도박스");

		String stringValue = strBox.get();
		
		printList(intValue);
		printList(stringValue);

		System.out.print("Int value: " + intValue);
		System.out.print("String value : " + stringValue);

	}
	
	public static <T> void printList(generics<T> a) {
		for (T item : a) {
			System.out.println(item);
		}

	
	}
	}
