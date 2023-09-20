package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class Practice2 {
	
	public void Practice2() {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자 입력: ");
	int n = scanner.nextInt();

	int factorial = 1;
	
	for(int i = 1;i<=n;i++){
		factorial *= i;
	}
	System.out.println(n + "! = " + factorial);
}
}
