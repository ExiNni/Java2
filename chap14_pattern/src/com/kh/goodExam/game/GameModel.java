package com.kh.goodExam.game;

public class GameModel {
	private int secretNumber; // 숨겨진 번호
	private int attempts; // 몇 번 시도했는가
	
	public GameModel() {
		// 1~100 사이의 무작위 숫자 생성하기
		secretNumber = (int)(Math.random() * 100) + 1;
		attempts = 0; // 최초 시도는 0번
	}
	public int getSecretNumber() {
		return secretNumber;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public void incrementAttempts() {
		attempts ++ ;
	}
	
	public boolean inCorrectGuess(int guess) {
		incrementAttempts();
		return guess == secretNumber;
	}

}
