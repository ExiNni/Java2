package com.kh.ThreadPractice;

import java.io.IOException;

public class GameMain {

	public static void main(String[] args) {
		GameMain run = new GameMain();
		run.practice1();
	}

	public void practice1() {
		// 외부 클래스의 인스턴스를 생성
		GameMain s = new GameMain();
		// 게임 루프 쓰레드 시작
		Thread gameThread = new Thread(new GameLoop());
		gameThread.start();

		// 게임 종료 조건 : 플레이어가 엔터키를 누르면 게임 종료
		try {
			System.in.read();
			// 사용자가 키보드로 입력한 바이트를 읽음
			// 사용자가 Enter키를 누를 때 까지 프로그램 일시 중지
			GameLoop.isGameOver = true;

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}