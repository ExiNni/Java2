package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMainExam {

	public static void main(String[] args) {

		// HashMap 생성 UserAge
		Map<String, Integer> user = new HashMap<>();
		// 유저의 이름과 나이
		user.put("이순신", 20);
		user.put("강감찬", 21);
		user.put("홍길동", 22);
		user.put("권율", 23);

		// 특정 유저 검색
		String searchName = "홍길동";
		if(user.containsKey(searchName)) {
			int age = user.get(searchName);
			System.out.println("유저 이름: " + searchName + " 나이 : " + age);
		} else {
			System.out.println(searchName + " 유저를 찾을 수 없습니다.");
		}
		// 모든 이름과 나이 출력
		for(Map.Entry<String, Integer> entry : user.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		// 유저 나이 수정
		String userUpdate = "홍길동";
		int newAge = 30;
		user.put(userUpdate, newAge);
		System.out.println(userUpdate + "의 나이를 " + newAge + "로 수정했습니다.");
		// 유저 탈퇴
		String removeUser = "강감찬";
		user.remove(removeUser);
		System.out.println(removeUser + "의 정보를 삭제했습니다.");

		//최종 유저 이름 나이 출력
		System.out.println("모든 유저 정보 : ");
		for (Map.Entry<String, Integer> entry : user.entrySet()) {
			System.out.print(entry + " ");
		}

	}

}
