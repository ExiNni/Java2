package com.kh.practice.exam;

import java.util.Scanner;

public class Practice_Hard22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i == 1) {
				for (int j = 1; j <= num; j++) {
					System.out.print("*");

				}
				System.out.println("");
			} else if (i == num) {
				for (int k = 1; k <= num; k++) {
					System.out.print("*");
				}

			} else {
				for (int l = i; l <= num; l++) {
					if (l == i || l == num) {
						System.out.print("*");
						
						
					}else
					System.out.print(" ");

					
				}System.out.println("");

			}

		}
	}

}
