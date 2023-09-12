package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class Practice8 {

	public void countWords() {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		String word;

		System.out.print("입력 : ");
		word = sc.nextLine();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				count++;
			}
		}

		System.out.println("단어의 개수  = " + count);
	}
}
