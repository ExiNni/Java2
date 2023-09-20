package com.kh.ThreadMain;

public class ThreadPriorityExam {

	public static void main(String[] args) {
		StudentThread st1 = new StudentThread("학생1");
		StudentThread st2 = new StudentThread("학생2");

		// 쓰레드에 우선순위 설정
		st1.setPriority(Thread.MAX_PRIORITY); // 우선순위를 최대로 설정하겠다.
		st2.setPriority(Thread.MIN_PRIORITY); // 우선순위를 최하로 설정하겠다.

		// 쓰레드 시작
		st1.start();
		st2.start();

	}
}
