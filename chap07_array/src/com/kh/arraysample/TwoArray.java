package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// 이중 문자열 배열 선언과 초기화
		String[][] fruits = {{"Apple", "Banana", "Cherry"},{"Grape", "Orange", "Strawberry"},{"Kiwi", "Mango", "pineapple"}};
		
		for(int i = 0; i < fruits.length; i++) {
			for(int a = 0; a < fruits.length; a++) {
				System.out.print(fruits[i][a] + " ");
			}
			System.out.println(); // 다음행으로 이동할 수 있게 enter 용 출력 메소드 입력
		}
	}
}
