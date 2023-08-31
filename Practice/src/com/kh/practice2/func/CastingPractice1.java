package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char word1;
		int word2;
		
		System.out.print("¹®ÀÚ: ");
		word1 = sc.next().charAt(0);
		word2 = (int)word1;
		
		System.out.println(word1 + " unicode : " + word2);
	}

}
