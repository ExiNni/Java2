package com.kh.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection run = new PracticeCollection();
		run.Practice1();
		run.Practice2();
		run.practice3();
	}
	
	public void Practice1() {
		List<String> myList = new ArrayList<>();
		// String add 해보고 for 문 출력하기
		myList.add("딸기");
		myList.add("당근");
		myList.add("수박");
		myList.add("참외");
		myList.add("멜론");
		myList.add("딸기");
		
		for(String newList : myList) {
			System.out.print(newList + " ");
		}
		System.out.println();
		
	}
	
	public void Practice2() {
		Set<String> myList = new HashSet<>();
		// String add 해보고 for 문 출력, 중복도니 값 add 해야함
		myList.add("딸기");
		myList.add("당근");
		myList.add("수박");
		myList.add("참외");
		myList.add("멜론");
		myList.add("딸기");
		
		for(String newList : myList) {
			System.out.print(newList + " ");
		}
		System.out.println();
	}
	
	public void practice3() {
		// 키와 값을 이용해서 map put 한 다음 향상된포문으로 출력하기
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("January", 1);
		myMap.put("February", 2);
		myMap.put("November", 11);
		myMap.put("May", 5);
		
		for(String month : myMap.keySet()) {
			int numMonth = myMap.get(month);
			System.out.println(month + " = " + numMonth);
		}

		
	}

}
