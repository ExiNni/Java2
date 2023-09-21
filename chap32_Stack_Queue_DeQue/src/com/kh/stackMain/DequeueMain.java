package com.kh.stackMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {
		
		
		/*
					      시작                           끝
					       |                            |
						   V                            V
						[first] < - > [second] < - > [third]
			
					^                                            ^
					|                                            |
				 [     ]                                      [     ]
		*/
		
		// ArrayDequeue 사용하여 Dequeue 생성
		Deque <String> str = new ArrayDeque<>();
		
		// 요소 추가
		str.addFirst("First");
		str.addLast("Last");
		
		// 맨 앞과 맨 뒤 요소 확인
		System.out.println(str.getFirst());
		System.out.println(str.getLast());
		
		// 맨 앞과 맨 뒤 요소 제거
		str.removeFirst();
		str.removeLast();
		System.out.println(str);
		
		// 비어있는지 확인
		System.out.println(str.isEmpty());
	}

}
