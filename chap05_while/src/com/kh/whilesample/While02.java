package com.kh.whilesample;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		boolean isChoice = false;
		
		while(!isChoice) {
			
			System.out.print("계절을 선택해주세요: ");
			int month = sc.nextInt();
	
			switch(month) {
			case 1 : case 2 : case 12 :
				System.out.println("겨울 입니다.");
				isChoice = true; // 위 ! 가 있을 경우 참은 거짓으로 변경되고, 거짓은 참으로 변경되기 때문에 true로 작성해줌
				break; // break 는 case 문에서 실행하고자 하는게 종료된 후 한 번만 사용한다.
			case 3 : case 4 : case 5 :
				System.out.println("봄 입니다.");
				isChoice = true;
				break;
			case 6 : case 7 : case 8 :
				System.out.println("여름 입니다.");
				isChoice = true;
				break;
			case 9 : case 10 : case 11 :
				System.out.println("가을 입니다.");
				isChoice = true;
				break;
			default :
				System.out.println("잘못 된 숫자입니다 다시 입력해주세요.");	
				System.out.println("");


			}
			

			
		}
		*/
		
		// 나이를 입력 받아 성인(19~20) 청소년(14~18) 어린이(10~13)로 분류한다
		// 이 외 나이는 다시 입력하세요 출력
		// while switch case 이용해서 출력
		
		boolean isTrue = true;
				
		while(isTrue) {
			
			System.out.print("나이를 입력하세요: ");
			int age = sc.nextInt();
			
			switch(age) {
			case 19 : case 20 :
				System.out.println("성인입니다.");
				isTrue = false;
				break;
			case 14 : case 15 : case 16 : case 17 : case 18 :
				System.out.println("청소년입니다.");
				isTrue = false;
				break; 
			case 10 : case 11 : case 12 : case 13 :
				System.out.println("어린이 입니다.");
				isTrue = false;
				break;
			default :
				System.out.println("나이를 다시 입력해주세요");
				System.out.println("");
			}
		}
	}

}
