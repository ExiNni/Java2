package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {

		ArrayList<String> toDo = new ArrayList<>();
		
		toDo.add("집 가기");
		toDo.add("과제하기");
		toDo.add("씻기");
		System.out.println(toDo);
		
		int size = toDo.size();
		System.out.println("총 할일 : " + size);
		
		toDo.remove(1);
		System.out.println("제거 체크 : " + toDo);
		
		toDo.add("잠자기");
		System.out.println("할 일 : " + toDo);

	}

}
