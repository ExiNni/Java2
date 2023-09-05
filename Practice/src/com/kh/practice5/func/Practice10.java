package com.kh.practice5.func;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String ssn = sc.nextLine();

		String ssn2 = ssn.substring(0, 8) + "******";

		System.out.println(ssn2);
	}

}
