package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("과일을 선택해주세요");

		int fruit = sc.nextInt();

		switch (fruit) {
		case 1:
			System.out.println("사과");
			break;
		case 2:
			System.out.println("포도");
			break;
		default:
			System.out.println("잘못된 선택입니다.");
		}
		*/

		
		  System.out.println("--------메뉴판--------");
		  System.out.println("|   1번 아메리카노      |");
		  System.out.println("|   2번 카페 라떼      |");
		  System.out.println("|   3번 아인슈페너      |");
		  System.out.println("|   4번 흑당 버블티     |");
		  System.out.println("---------------------");
		  System.out.print("드실 음료 번호를 골라주세요: ");
		  
		  int choice; 
		  choice = sc.nextInt();
		  
		  switch (choice) { 
		  case 1: 
			  System.out.println("아메리카노를 주문하셨습니다."); 
			  break; 
		  case 2: 
			  System.out.println("카페 라떼를 주문하셨습니다."); 
			  break; 
		  case 3:
			  System.out.println("아인슈페너를 주문하셨습니다."); 
			  break; 
		  case 4:
			  System.out.println("흑당 버블티를 주문하셨습니다."); 
			  break; 
		  default:
			  System.out.println("주문 번호를 다시 확인해주세요.");
		  
		  }
		 
		  System.out.println("과자를 고르세요. 1.새우깡 2.칸쵸 3.오레오");
		  int yammy = sc.nextInt();
		  

			switch (yammy) {
			case 1:
				System.out.println("새우깡");
				break;
			case 2:
				System.out.println("칸쵸");
				break;
			case 3:
				System.out.println("오레오");
				break;
			default:
				System.out.println("잘못된 선택입니다.");
			

		  
		
	
	}

}
}
