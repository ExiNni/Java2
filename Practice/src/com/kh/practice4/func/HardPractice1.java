package com.kh.practice4.func;

import java.util.Scanner;

public class HardPractice1 {
	public static void main(String[] args) {
		
		/*
			사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
			단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
			
			‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
			ex) 2, 3, 5, 7, 11 …
			
			ex. 
			숫자 : 5 		숫자 : 9 			숫자 : 0
			소수입니다. 	소수가 아닙니다. 	잘못 입력하셨습니다
		*/	
		
		// 사용자로부터 입력 받은 하나의 값이 소수이닞 판별하는 프로그램을 구현하세요
		Scanner sc = new Scanner(System.in); // 입력받기 위해 불러오는 메소드
		
		// 만약에, 입력한 수가 2보다 작은 경우 "잘못 입력하셨습니다."를 출력하세요.
		System.out.print("숫자를 입력해주세요: ");
		int num = sc.nextInt();
		
		int count = 1; // count를 1로 초기화 소수가 아닌 수의 개수를 나타냄
		
		// ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		if(num < 2) { // 만약에 입력한 수가 2보다 작을 경우 
			System.out.println("잘못 입력하셨습니다.");
		}else { // 만약에 입력한 수가 2보다 클 경우
			// 소수인지 아닌지 판별하는 boolean
			boolean checkNum = true; // 소수 여부를 판단하기 위한 boolean 변수 checkNum 초기화, 처음에는 소수로 가정
			
			for(int i = 2; i <= num; i ++) { // for 문을 활용해서 나타낸 출력
				// 2부터 입력받은 숫자 num 까지의 반복문 소수를 찾는 역할
				for(int a = 2; a * a  <= i; a++) { // 입력받은 숫자가 아닌 현재 숫자 i 가 소수인지 판단하기 위한 반복문
					
					/*
						숫자 i 가 소수인지 확인하려면 2부터 i - 1 까지 모든 숫자를 i를 나누는 방법
						a * a 사용하는 원리:
										만약 i 가 어떤 숫자 a로 나누어 떨어진다면 i 가 a의 배수라면 i/a 역시 i의 약수 중 하나
										이때 i 를 a 보다 콘 숫자로 나누면 이미 a로 떨어지지 않이 때문에 a가 i 의 약수라면
										i/a 역시 i의 약수이고, a는 i/a는 서로 다른 숫자 
										i가 소수인지 판별하기 위해 2부터 i- 까지 모든 숫다 대신 2부터 i까지의 
					*/	
					
					
					
					if(i % a == 0) {
						// 만약에 소수가 아닐경우
						checkNum = false;
						count ++;
						break;
					}
					if(checkNum) {
						// 소수 일 때 값을 출력
						System.out.println(i); // 출력 메소드 작성
					}
					checkNum = true;
				}
				System.out.println("소수의 총 갯수 : " + (num - count)); // 모든 숫자 검사가 끝난 후, 소수가 아닌 개수를 뺴서 출력
			}
		}
	}
	

}
