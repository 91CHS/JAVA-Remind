package com.lec.ex01_runtime;

public class ClassCastMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		changeDog(dog);
		changeDog(cat); // ClassCastException  메소드가 dog로 짜여있어서 강제형변환 오류

	}

	private static void changeDog(Animal animal) {
//		if(animal instanceof Dog) { // 도그일때만 허용하게해서 예외를 방지할 수 있다.
			Dog dog = (Dog) animal; // Animal객체를 Dog로 강제 형변환
			System.out.println(dog);
//		}
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}