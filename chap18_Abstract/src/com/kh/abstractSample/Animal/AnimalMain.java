package com.kh.abstractSample.Animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("바둑이");
		System.out.println("강아지 이름: " + myDog.getAnimal());
		System.out.println("강아지 울음소리: " + myDog.animalSound());
		
		Cat myCat = new Cat("나비");
		System.out.println("고양이 이름: " + myCat.getAnimal());
		System.out.println("고양이 울음소리: " + myCat.animalSound());		
		
		Animal[] animal = new Animal[2];

		animal[0] = new Cat("뽀삐");
		animal[1] = new Cat("아무무");
		System.out.println("고양이 이름: " + animal[0].getAnimal());
		System.out.println("고양이 울음소리: " + animal[0].animalSound());		
		System.out.println("고양이 이름: " + animal[1].getAnimal());
		System.out.println("고양이 울음소리: " + animal[1].animalSound());		
		
		/*
		 * for(Animal a : animal){
		 * a.displayName();
		 * a.makesound();
		 * sysout;
		 * }
		 *
		 */
		
	}
	
	/*	public static void main(String[] args) {
	Dog myDog = new Dog("바둑이", "멍");
	System.out.println("강아지 이름: " + myDog.getAnimal());
	System.out.println("강아지 울음소리: " + myDog.animalSound());
}
*/

}
