package com.kh.switchsample;

public class SwitchBreak {

	public static void main(String[] args) {

		int day = 2;
		switch (day) { //day == 30
			case 1: //case가 30이면 월요일 출력 false
				System.out.println("월요일"); //출력되지 않음
				
			case 2:
				System.out.println("화요일"); //출력되지 않음
				
			case 30:
				System.out.println("수요일");
				
			default :
				System.out.println("주말");
		}

	}

}