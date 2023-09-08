package com.kh.mvc.person.mo.PersonModel;

public class PersonModel {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PersonModel(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
