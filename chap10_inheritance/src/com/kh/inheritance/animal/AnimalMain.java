package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("大大捞");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat =  new Cat("具克捞");
		myCat.info();
		myCat.run();
		myCat.eat();
		
		Monkey myMonkey = new Monkey("件捞");
		myMonkey.info();
		myMonkey.eat();
		
		Lion myLion = new Lion("King");
		myLion.info();
		myLion.eat();
		myLion.sleep();
	}

}
