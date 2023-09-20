package com.kh.practice7;

import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();

		int numRows = sc.nextInt();
		int[][] charArray = new int[numRows][];

		for (int i = 0; i < numRows; i++) {
			System.out.println(i + "열의 크기 받기: ");
			int numCols = sc.nextInt();

			charArray[i] = new int[numCols];

			int StartValue = i * numCols + 1;
			for (int j = 0; j < numCols; j++) {
				charArray[i][j] = StartValue++;
			}

		}
		for (int i = 0; i < numRows; i++) {
			for(int j = 0; j < charArray[i].length; j++) {
				System.out.print((char)('a' + charArray[i][j] - 1));
			}
			System.out.println();
		}
	}

}
