package com.kh.arraysample;

public class Array05 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5}; // length = 5, index = 0~4
		
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[0];
		}
		System.out.println("배연 요소의 합 :" + sum);
	}
}
