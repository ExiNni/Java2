package com.kh.practice.exam;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요: ");
		int num = sc.nextInt();
		int mul;
		
		System.out.println("====" + num + "단====");
		
		for(int i = 1; i <= 9; i++) {
			mul = num * i;
			
			
			System.out.println(num + " * " + i + " = " + mul);
		} 
	}

}

