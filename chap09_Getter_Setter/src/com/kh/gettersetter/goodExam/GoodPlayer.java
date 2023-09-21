package com.kh.gettersetter.goodExam;

import com.kh.gettersetter.PlayerCharacter;

public class GoodPlayer {

	private String name;
	private int health;
	private int attackPower;

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void isValidName() {
		if (this.name == "") {
			System.out.println("이름을 넣지 않았습니다.");
		}
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void isValidHealth() {
		if (health <= 0) {
			this.health = 0;
			System.out.println("체력이 없습니다.");
		}
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public void isValidAttackPower() {
		if (attackPower <= 0) {
			this.attackPower = 0;
			System.out.println("힘이 부족합니다.");
		}
	}

	public void displayInfo() {
		System.out.println("캐릭터 정보: " + this.name);
		System.out.println("체력 정보: " + this.health);
		System.out.println("공격 파워 : " + this.attackPower);
		System.out.println("======================================");
	}

	public void attack(GoodPlayer target) {
		System.out.println("공격했습니다.");
		System.out.println("[" + this.name + "]가 [" + target.getName() + "]에게 " + this.attackPower + " 데미지를 입혔습니다.");
		System.out.println("[" + target.getName() + "]의 남은 체력은 [" + (target.health - attackPower) + "] 입니다");
		System.out.println("======================================");

	}

	public void takeDamage(int damage) {
		System.out.println("공격 받았습니다.");
		System.out.println("======================================");

	}

}

// void 와 return 은 같이 있을 수 없다
// void: 반환값이 없음
// return: 반환값이 있음
