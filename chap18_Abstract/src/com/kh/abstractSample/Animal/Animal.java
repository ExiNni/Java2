package com.kh.abstractSample.Animal;

abstract class Animal {
	private String name;
	abstract String animalSound();

	public Animal(String name) {
		this.name = name;
	}

	public void setAnimal(String name) {
		this.name = name;
	}

	public String getAnimal() {
		return name;
	}

	public static void main(String[] args) {
	}
}
