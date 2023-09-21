package com.kh.objExam;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 문자 입력: ");
		String word1 = sc.next();

		System.out.print("두 번째 문자 입력: ");
		String word2 = sc.next();

		boolean isEqual = word1.equals(word2);
		if (isEqual) {
			System.out.println(word1 + "과 " + word2 + "는 같습니다.");
		} else {
			System.out.println(word1 + "과 " + word2 + "는 같지 않습니다.");
		}
	}

}
