package junk;

import java.util.HashMap;
import java.util.Map;

public class mapPractice {

	public static void main(String[] args) {

		Map<String, Integer> user = new HashMap<>()
				;
		user.put("홍길동", 10);
		user.put("강감찬", 11);
		user.put("유관순", 12);
		user.put("이이", 13);
		user.put("이순신", 14); 
		
		String searchName = "홍길동";
		
		if(user.containsKey(searchName)) {
			int age = user.get(searchName);
			System.out.println("유저 이름: " + searchName + " 나이 : " + age);
			
		} else {
			System.out.println("유저를 찾을 수 없습니다.");
		}
		
		for(Map.Entry<String, Integer> entry : user.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}

	}
	

}
