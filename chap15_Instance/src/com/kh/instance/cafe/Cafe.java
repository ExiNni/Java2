package com.kh.instance.cafe;

public class Cafe {
	String type;
	int size;
	boolean isSugar;
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
		
	}
	
	public void Sugar() {
		if(isSugar == true) {
			System.out.println("설탕을 추가합니다.");

		}else {
			System.out.println("설탕을 넣지 않습니다.");
		}
	}
	
	public void size() {
		System.out.println("커피 크기: " + size);
	}
	
	public void type() {
		System.out.println("커피 종류: " + type);
	}
}
