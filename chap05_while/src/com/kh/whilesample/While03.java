package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		// 반복적으로 출력
		
		int i = 1;
		while (i <= 10) { // 5가 될 때 출력을 멈추고 싶어
			System.out.println(i);	
			i = ++i;
			
			/*
				i++ 일 때 i가 1인 값을 먼저 대입했기 때문에 ++가 작동하지 않았다.
				-> 무한루프 발생
				
				++i 일 때 i에 +1을 먼저 대입
				1~10 출력 가능
				-> 무한루프 발생하지 않는다
			*/
		}
	}
}
