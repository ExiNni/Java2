package com.kh.example.pracitce1.model.vo;

import java.util.Scanner;

public class Member {

	Scanner sc = new Scanner(System.in);
	String memberID, memberPwd, memberName, phone, email, newName;
	int age;
	char gender;
	
	public Member(String memberID, String memberPwd, String memberName, int age, char gender, String phone, String email) {
	this.memberID = memberID;
	this.memberPwd = memberPwd;
	this.memberName = memberName;
	this.age = age;
	this.gender = gender;
	this.phone = phone;
	this.email = email;
	
	
			
	}
	
	public void changeName(String newName) {
		this.newName = newName;
		
	}
	public void printName() {
		System.out.println("수정 전 이름: " + memberName + "/ 수정 후 이름: " + newName);
		System.out.println("멤버 아이디: " + memberID);
		System.out.println("멤버 비밀번호: " + memberPwd);
		System.out.println("멤버 나이: " + age);
		System.out.println("멤버 성별: " + gender);
		System.out.println("멤버 전화번호 " + phone);
		System.out.println("멤버 이메일: " + email);
	}
	

}
