package com.kh.example.pracitce1.run;

import com.kh.example.pracitce1.model.vo.Member;

public class MemberRun {

public static void main(String[] args) {
		
		Member newMember = new Member("ExiNni", "123456", "홍길동", 25, '남', "010-1234-5678", "hong@google.com");
		
		newMember.changeName("이순신");
		newMember.printName();
		

		
	}

}