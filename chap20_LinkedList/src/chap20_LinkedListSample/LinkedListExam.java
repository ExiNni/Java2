package chap20_LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	
	public static void main(String[] args) {
		// List 인터페이스 LinkedList 객체 활용해서 값넣고 출력
		List<String> list = new LinkedList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("홍범도");
		
		System.out.println(list);
		// String 값 넣고 수정 삭제 출력
		list.set(2, "유관순");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		// LinkedList 객체 new LinkedList 객체
		
		List<Integer> intList = new LinkedList<>();
		intList.add(3);
		intList.add(2);
		System.out.println(intList);
		
		
		// int 값 넣고 수정 삭제 출력
	}

}
