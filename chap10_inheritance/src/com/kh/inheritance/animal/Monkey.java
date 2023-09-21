package com.kh.inheritance.animal;

public class Monkey extends Animal{

	public Monkey (String name) {
		super(name);

	}
	
	@Override
	public void eat() {
		System.out.println(getName() + "는 바나나를 먹습니다.");
	}
	
}
