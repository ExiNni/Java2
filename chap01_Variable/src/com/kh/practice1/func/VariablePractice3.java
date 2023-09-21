package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double width, height;
		
		System.out.print("가로 길이를 입력해주세요: ");
		width = sc.nextDouble();
		
		System.out.print("세로 길이를 입력해주세요: ");
		height = sc.nextDouble();
		  
		System.out.println("면적의 넓이는 " + (width*height) + " 이며 둘레의 길이는 " + 
		(2*(width+height)) + " 입니다");
		
	
	}

}
