package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
		colors.add("빨강");
		colors.add("주황");
		colors.add("노랑");
		colors.add("초록");
		colors.add("파랑");
		colors.add("남색");
		colors.add("보라");
		
		System.out.println("전체색상: " + colors);
		
		colors.set(1, "블랙");
		colors.set(3, "브라운");
		colors.set(4, "그린");
		
		colors.add(2, "옐로우");
		colors.remove(3);
		colors.remove(3);
		
		System.out.println("수정 된 색상: " + colors);
		
	}

}
