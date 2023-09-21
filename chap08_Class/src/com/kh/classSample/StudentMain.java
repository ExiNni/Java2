package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {

		// 학생의 객체 생성
		
		//학생 정보 출력
		Student student1 = new Student("홍길동", 24, "3학년");
		Student student2 = new Student("김개똥", 27, "6학년");
		Student student3 = new Student("이순신", 21, "1학년");
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		
		
	}

}
