package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double korean, english, math;
		int korean2, english2, math2;
		
		System.out.print("국어 점수: ");
		korean = sc.nextDouble();
		korean2 = (int)korean;
		System.out.print("영어 점수: ");
		english = sc.nextDouble();
		english2 = (int)english;
		System.out.print("수학 점수: ");
		math = sc.nextDouble();
		math2 = (int)math;
		
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("총점: " + (korean2 + english2 + math2));
		System.out.println("평균: " + ((korean2 + english2 + math2)/3));
	}

}