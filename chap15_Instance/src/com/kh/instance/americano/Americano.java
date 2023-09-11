package com.kh.instance.americano;

public class Americano {
	private int size; // 아메리카노 사이즈
	private boolean hasSugar; // 설탕 여부
	
	public Americano(int Size, boolean hasSuger) {
		this.size = Size;
		this.hasSugar = hasSuger;
	}
	
	public void makeCoffee() {
		System.out.println("아메리카노를 만듭니다.");
		System.out.println("크기 : " + size);
		
		// 만약에 설탕을 넣는다면!
		if(hasSugar) {
			System.out.println("설탕을 추가합니다.");
		}
	}

}
