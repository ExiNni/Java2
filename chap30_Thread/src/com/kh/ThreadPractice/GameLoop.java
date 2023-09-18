package com.kh.ThreadPractice;

import java.util.Random;

public class GameLoop implements Runnable {
	public static boolean isGameOver;

	@Override
	public void run() {

		while (!isGameOver) {
			// 게임 루프 내용을 넣겠다
			int randomValue = new Random().nextInt(10);
			System.out.println("임의의 숫자 : " + randomValue);

			// 게임 루프 지연 시간
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("게임을 종료하려면 Enter를 입력하세요");
		}
	}
	
}
