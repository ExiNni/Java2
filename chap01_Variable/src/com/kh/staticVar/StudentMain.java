package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("KH 학생1");
		stKim.serialNumber++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH 학생2");
		System.out.println(stKim.serialNumber);
		System.out.println(khLee.serialNumber);
		
	}

}
