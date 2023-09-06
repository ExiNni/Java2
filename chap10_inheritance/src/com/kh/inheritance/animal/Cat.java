package com.kh.inheritance.animal;

public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName() + " 주인이 와서 달린다!");
	}
	@Override // animal에 적혀있는 eat을 고양이 안에서만 한 번더 다시 정의를 내린다.
	public void eat() {
		System.out.println(getName() + " 먹는데 중간에 먹이통을 뺏을거야");
	}
}
