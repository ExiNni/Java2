package com.kh.forsample;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i = 2; i <= 9; i++) {
			System.out.println("------------------------------------------");
			System.out.println(i + "단");
			
			for(int j =1; j <=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			
			}
		}
		
		int a, b;
	
		System.out.println("첫 번째 숫자 입력: ");
		a = sc.nextInt();
		System.out.println("두 번째 숫자 입력: ");
		b = sc.nextInt();
		System.out.println(a + "단: ");
		for(int i = 1; i <= b; i++) {
			System.out.println(a + " * " + i + " = " + (a*i));
		}
		
	}

}
