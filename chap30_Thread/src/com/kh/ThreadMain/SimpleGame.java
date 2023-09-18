package com.kh.ThreadMain;

import java.io.IOException;
import java.util.Random;

public class SimpleGame {
	private static boolean isGameOver = false;

	public static void main(String[] args) {
		// 외부 클래스의 인스턴스를 생성
		SimpleGame s = new SimpleGame();
		// 게임 루프 쓰레드 시작
		Thread gameThread = new Thread(s.new GM());
		gameThread.start();

		// 게임 종료 조건 : 플레이어가 엔터키를 누르면 게임 종료
		try {
			System.in.read();
			// 사용자가 키보드로 입력한 바이트를 읽음
			// 사용자가 Enter키를 누를 때 까지 프로그램 일시 중지
			isGameOver = true;
			
			 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class GM implements Runnable{
		@Override
		public void run() {
			while(!isGameOver) {
				// 게임 루프 내용을 넣겠다
				int randomValue = new Random().nextInt(10);
				System.out.println("임의의 숫자 : " + randomValue);
				
				// 게임 루프 지연 시간
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("게임을 종료하려면 Enter를 입력하세요");
			}
		}
	}
	

	class GameLoops implements Runnable {
		@Override
		public void run() {
			while (!isGameOver) {
				// 게임 루프 내용
				int randomValue = new Random().nextInt(10); // 인위의 숫자 생성
				System.out.println("임의의 숫자 : " + randomValue);

				// 게임 루피 지연 시간
				try {
					Thread.sleep(1000); // 1초 대기
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("게임 종료");
			}
		}
	}
}