package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class Practice3 {

	public void Practice3() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("문자 입력: ");
	     String input = scanner.nextLine();
	     
	     
	     
	     String reversed = new StringBuilder(input).reverse().toString();
	     System.out.println(reversed);
	       
	
	}
}
