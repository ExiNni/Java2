package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double width, length;
		
		System.out.print("가로 길이를 입력해 주세요: ");
		width = sc.nextDouble();
		
		System.out.print("세로 길이를 입력해 주세요: ");
		length = sc.nextDouble();
		
		System.out.println("면적: " + (width * length));
		System.out.println("둘레: " + ((width + length)*2));
		
	}

}
