package com.kh.practice.exam;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
        boolean isTrue = true;

        while (isTrue) {
            System.out.print("���� �Է� : ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
            } else {
                for (int i = 1; i <= num; i++) {
                    System.out.println(i);
                }
                isTrue = false;
            }
        }
    }
}