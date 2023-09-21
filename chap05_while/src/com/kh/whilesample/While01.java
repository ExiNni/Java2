package com.kh.whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		
		
		while(isTrue) { // isTrue = True이기 때문에 true 대신 사용
			System.out.println("1. 아메리카노");
			System.out.println("2. 카푸치노");
			System.out.println("3. 말차 밀크티");
			System.out.print("커피를 주문해주세요: ");
			int choice = sc.nextInt(); 
			
			switch(choice) {
			case 1:
				System.out.println("아메리카노를 주문!");
				isTrue = false; // 아메리카노를 주문했으니 while문을 종료하기 위해서 false를 넣는다.
				break;
			case 2:
				System.out.println("카푸치노를 주문!");
				isTrue = false;
				break;
			case 3:
				System.out.println("말차 밀크티를 주문!");
				isTrue = false;
				break;
			default:
				System.out.println("잘못 주문했습니다 다시 주문해주세요");
				System.out.println("");
			}

		}
		
	}
}
