package com.kh.practice.exam;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
        boolean isTrue = true;

        while (isTrue) {
            System.out.print("숫자 입력 : ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("1 이상의 숫자를 입력해주세요.");
            } else {
                for (int i = num; i >= 1; i--) {
                    System.out.println(i);
                }
                isTrue = false;
            }
        }
    }
}

