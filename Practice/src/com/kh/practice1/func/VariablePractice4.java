package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String word;
		
		System.out.print("3개 이상 문자열을 입력하세요: ");
		word = sc.nextLine();
        
		if (word.length() >= 3) {
            char firstChar = word.charAt(0);
            char secondChar = word.charAt(1);
            char thirdChar = word.charAt(2);

            System.out.println("첫 번째 문자: " + firstChar);
            System.out.println("두 번째 문자: " + secondChar);
            System.out.println("세 번째 문자: " + thirdChar);
		}
		else {
			System.out.println("문자를 3개 이상 입력하세요.");
			
		}
        
	}

}
