package com.kh.ifsample;

public class IfExam {

	public static void main(String[] args) {
		/*
			중첩 이중 if문
				if (조건식1){
				
					if (조건식2){
						
						if (조건식3){
							수행될 문장;
						}else if (조건식4){
							수행될 문장;
						}else{
							수행될 문장;
						}
					}else{
						수행될 문장;
					}
				}
				*/
		
		// 날씨에 따른 경보!
		int month = 7;
		int temp = 30;
		if (month == 1 || month == 2 || month == 12) {
			System.out.println("겨울");
			if (temp <= -15) {
				System.out.println("한파 경보.");
			}else if (temp <= -12) {
				System.out.println("한파 주의보");
			}
		}else if ( month >=3 && month <= 5) {
			System.out.println("봄");
			
		}else if( month >= 6 && month <= 8) {
			System.out.println("여름");
			if ( temp >= 35 ) {
				System.out.println("폭염 경보");
			}else if ( temp >= 33) {
				System.out.println("폭염 주의보");
			}
		}else if ( month >= 9 && month <= 11) {
			System.out.println("가을");
		}else {
			System.out.println("숫자가 잘못 되었습니다.");
		}
	}
}
