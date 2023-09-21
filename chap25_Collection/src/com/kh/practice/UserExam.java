package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {
	public static void main(String[] args) {
		// Map <String, Integer>
		// 이름, 나이
		// contains

		Map<String, Integer> user = new HashMap<>();
		user.put("이순신", 25);
		user.put("강감찬", 24);
		user.put("유관순", 23);
		user.put("홍길동", 22);

		String userName = "이순신";

		if (user.containsKey("이순신")) {
			int age = user.get(userName);
			System.out.println(userName + "의 나이 : " + age);
		} else {
			System.out.println(userName + "의 나이를 찾을 수 없습니다.");
		}
	}

}
