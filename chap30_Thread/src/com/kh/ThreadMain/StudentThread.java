package com.kh.ThreadMain;

public class StudentThread extends Thread{
	private String studentName;
	
	public StudentThread(String name) {
		this.studentName = name;
		
	}
	
	@Override
	public void run() {
		System.out.println(studentName + "가 드디어 공부를 시작합니다.");
		try {
			Thread.sleep(2000); // 쓰레드가 2초 동안 잠자기 상태로 있도록 합니다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(studentName + "가 공부를 마칩니다.");
	}
	
}
