package com.kh.practice.exam;

import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		boolean isTrue = true;
		
		while(isTrue) {
			for(int i = 1; i <= num; i++) {
				System.out.println(i);
				isTrue = false;
			}
			switch(num) {
			case 0:
				System.out.println("1이상의 숫자를 입력해주세요");
				
			default:
				System.out.println("1이상의 숫자를 입력해주세요");
				
			
				
			}
			
		}
		
		
	}

}