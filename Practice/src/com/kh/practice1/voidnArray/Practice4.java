package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class Practice4 {

	public void Practice4() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("배열 크기 입력: ");
		int size = scanner.nextInt();

		int[] numbers = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			System.out.println((i + 1) + " 번째 숫자 입력: ");
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
			
		}
		
		System.out.println("sum: " + sum);


	}
}
