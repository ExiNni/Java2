package com.kh.scannersample;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("나이를 입력해 주세요: ");
		int age = sc.nextInt(); //정수만 받는 next
		System.out.println("내 나이는 " + age + "세 입니다");
		
		String name;
		String phoneNumber;
		
		System.out.print("당신의 이름을 입력하세요: ");
		name = sc.next();
		System.out.print("당신의 전화번호를 입력하세요: ");
		
		phoneNumber = sc.next();
		System.out.print("당신의 이름은 " + name +  "입니다. 당신의 전화번호는 " + phoneNumber + "입니다.");
		*/
		
		// 내 취미와 내가 좋아하는 음식과 내 주소 출력하기
		String hobby, food, address;
		
		System.out.print("내 취미를 입력해주세요: ");
		hobby = sc.next();
		System.out.print("내가 좋아하는 음식을 입력해주세요: ");
		food = sc.next();
		System.out.print("내 주소를 입력해주세요: ");
		address = sc.nextLine();
		address = sc.nextLine();
	
		
		
		
		System.out.println("나의 취미는 " + hobby + "이며 내가 좋아하는 음식은 " + food + "이고"
				+ " 나의 주소는 " + address + " 입니다.");
		
	}

}
