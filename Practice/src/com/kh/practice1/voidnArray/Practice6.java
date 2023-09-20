package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class Practice6 {

	public static void Practice6() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		int num = scanner.nextInt();

		boolean isPrime = isPrimeNumber(num);

		if (isPrime) {
			System.out.println("소수 입니다.");

		} else {
			System.out.println("소수가 아님니다.");

		}
		
	}

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			System.out.println("2보다 큰 수를 입력하세요.");
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;

			}
		}
		return true;
		

	}
}