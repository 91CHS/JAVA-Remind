package com.lec.ex01_interface;

public class AnimalMain {

	public static void main(String[] args) {
		
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Bird());
		animalSound(new 사자());
		animalSound(new 호랑이());
	}

	public static void animalSound(Animal animal) {
		 animal.sound();
		
	}

}

class 사자 implements Animal {

	@Override
	public void sound() {
		System.out.println("어흥!!!");
		
	}
	
}

class 호랑이 implements Animal {

	@Override
	public void sound() {
		System.out.println("어흥~~~~");
	}
	
}