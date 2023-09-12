package com.kh.practice1.voidnArray;

import java.util.Scanner;

public class Practice5 {
	
	public void Practice5() {
		Scanner scanner = new Scanner(System.in);
	       
		System.out.print("배열의 크기 입력: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];

       
        for (int i = 0; i < size; i++) {
        	System.out.print((i + 1) + "번째 값: ");
        	numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("가장 큰 숫자: " + max);

	        
	}

}
