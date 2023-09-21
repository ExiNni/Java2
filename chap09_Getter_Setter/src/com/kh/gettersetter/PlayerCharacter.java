package com.kh.gettersetter;

public class PlayerCharacter {
	private String name; // 캐릭터 이름
	private int health; // 체력
	private int attackPower; // 공격파워

//	public PlayerCharacter(String name, int health, int attackPower) {
//		this.name = name;
//		this.attackPower = attackPower;
//		this.health = health;
//	}

	/*
	 * getter 데이터 복사본을 던져주기 때문에 원래 객체의 데이터는 손상시키지 않음 원본데이터는 안전함
	 */

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	/*
	 * setter 외부에서 메소드를 통해 데이터에 접근을 하게 된다면 메소드는 매개값(=매개변수)을 검증해서 유요한 값만 데이터로 저장할 수
	 * 있음
	 */

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		// 만약에 체력이 0이면 죽이고 체력이 1이상이면 살리자
		this.health = health;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	// 캐릭터 정보 출력
	public void displayInfo() {
		System.out.println("캐릭터 정보: " + name);
		System.out.println("체력 정보: " + health);
		System.out.println("공격 파워 : " + attackPower);
	}

	// 캐릭터 공격하는 출력 메서드
	public void attack(PlayerCharacter target) {
		System.out.println("[" + name + "]가 공격했습니다. [" + target.getName() + "]에게 " + attackPower + " 데미지를 입혔습니다.");
		System.out.println("공격했습니다.");
	}

	// 다른 캐릭터로 부터 공격 받았을 때 메서드

	public void takeDamage(int damage) {
		System.out.println("공격 받았습니다.");
	}

}
