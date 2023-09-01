package com.kh.practice.exam;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력해주세요: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			for (int i = num1; i >= num2; i--) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}

	}

}
