package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	// stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용
	public static void main(String[] args) {
		PracticeMain run = new PracticeMain();
		run.Practice2();
		
	}
	public void Practice1() {
		Stack<String> str = new Stack<>();
		str.push("홍길동");
		str.push("강감찬");
		str.push("이순신");
		str.push("안중근");
		str.push("홍범도");
		
		System.out.print(str);
		System.out.println();
		System.out.println(str.pop());
		
		str.clear();
		System.out.println(str);
		
		str.push("사과");
		str.push("바나나");
		str.push("딸기");
		str.push("포도");
		str.push("오렌지");
		System.out.print(str);
		System.out.println();
		
		System.out.println(str.size());
		System.out.println(str.contains("딸기"));
		
	}
	
	public void Practice2() {
		Queue<String> str = new LinkedList<>();
		
		str.offer("사과");
		str.offer("딸기");
		str.offer("복숭아");
		str.offer("포도");
		str.offer("멜론");
		str.offer("체리");
		str.offer("바나나");
		
		System.out.print(str);
		System.out.println();
		
		str.poll();
		System.out.print("poll : " + str);
		System.out.println();
		
		System.out.println("str peek : " + str.peek());
		
		System.out.println("str size : " + str.size());
		
		while(!str.isEmpty()) {
			String element = str.poll();
			System.out.print(element);
		}
	}
}
