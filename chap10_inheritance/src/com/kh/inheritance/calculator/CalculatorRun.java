package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator {

	public static void main(String[] args) {
		
		CalculatorForMod cal = new CalculatorForMod();
		System.out.println("Sum = " + cal.add(0, 0));
		System.out.println("Mul = " + cal.multiply(0, 0));
		System.out.println();
		
		/*
		 * Calculator cal = new Calculator();
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("첫 번재 정수 입력: "); int
		 * num1 = sc.nextInt();
		 * 
		 * System.out.print("두 번째 정수 입력: "); int num2 = sc.nextInt();
		 * 
		 * int result1 = cal.add(num1, num2); int result2 = cal.substruct(num1, num2);
		 * int result3 = cal.multiply(num1, num2); int result4 = cal.divide(num1, num2);
		 * 
		 * System.out.println("Add: " + result1); System.out.println("substruct: " +
		 * result2); System.out.println("multiply: " + result3);
		 * System.out.println("divide: " + result4);
		 */
	}

}
