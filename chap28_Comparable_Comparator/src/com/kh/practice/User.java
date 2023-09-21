package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String> {

	@Override
	public int compare(String user1, String user2) {
		if (user1.length() == user2.length()) {
			return 0;
		} else if (user1.length() < user2.length()) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// List ArrayList 생성 Comparator 정리
		List<String> str = new ArrayList<>();
		str.add("John");
		str.add("Mac");
		str.add("Charlie");
		str.add("Alice");
		str.add("Bob");
		str.add("Delta");
		str.add("Foxtrot");
		str.add("Golf");
		str.add("Hotel");
		str.add("Indian");
		str.add("Kilo");

		Collections.sort(str, new User());

		for (String a : str) {
			System.out.println(a);
		}
	}
}
