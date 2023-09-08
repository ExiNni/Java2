package com.kh.practice3.userScanner;

import java.util.Scanner;

public class UserScannerMain {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요: ");
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("정수 index : " + i);
			numbers[i] = sc.nextInt();


		}
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		System.out.println("배열의 모든 요소를 더한 결과: " + sum);

	}

}
