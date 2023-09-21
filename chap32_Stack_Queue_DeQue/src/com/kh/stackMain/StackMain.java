package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// stack 에 값 추가 - push();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// stack 값 삭제는 stack.pop();
		// stack 값 전체 제거 stack.clear();
		// stack 가장 상단의 값 출력(가장 마지막에 넣은 값) stack.peek();
		// stack 의 크기 출력 stack.size();
		// stack 이 비어있는지 확인 stack empty(); // 비어있다면 true 하나라도 들어있다면 false
		// stack에 1이 있는지 확인 stack.contains(1); // 1이 존재하면 true
		
		
		/*
			|     |
			|  3  |
			|  2  |
			|__1__|
		*/
		
		System.out.println(stack.pop()); // 3
		System.out.println(stack.pop()); // 2
	}
}
