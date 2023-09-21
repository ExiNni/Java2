package com.kh.ArrayExam;

import java.util.Scanner;

public class ArrayExam {
	public void practice1() {
		int value = 16;
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.println(arr[i][j]);
			}
		}
	}

	public void practice2() {
		int value = 16;
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
		int row = 0; // 행
		int col = 0; // 열
		char value = 'a';
		char[][] arr = null;
		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		row = sc.nextInt();

		arr = new char[row][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + " 행의 크기");
			col = sc.nextInt();

			arr[i] = new char[col];

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
	
	public void practice4() {
		int count = 0;
		String[] students = {"강건강","남나나","도대담","류라라","문미미","박보배","숭성실","윤예의","진재주","차천축","피풍표", "홍하하"};
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		
		for(int i = 0 ; i < seat1.length; i++) {
			for(int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];

			}
		}
		
		for(int i = 0 ; i < seat2.length; i++) {
			for(int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];

			}
		}
		System.out.println("===1분단===");
		for(int i = 0; i < seat1.length; i++) {
			for(int j = 0; j < seat1[i].length; j++) {
				System.out.println(seat1[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("===2분단===");
		for(int i = 0; i < seat2.length; i++) {
			for(int j = 0; j < seat2[i].length; j++) {
				System.out.println(seat2[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	
}
