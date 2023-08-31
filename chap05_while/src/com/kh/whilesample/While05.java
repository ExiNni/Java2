package com.kh.whilesample;

import java.util.Scanner;

public class While05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5이하의 정수를 입력해주세요: ");
		int num = sc.nextInt();
		int sum = 10;
		
		while(sum <= 10) {
			 
			sum += num;
			num = (num + 1);
			
			System.out.println("num : " + num);
			System.out.println("sum : " + sum);
			

		}
	}
}
