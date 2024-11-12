package com.lec.ex10_abstract.method;

public class AnimalMain {

	public static void main(String[] args) {
		
//		Animal animal = new Animal(); 추상클래스는 객체를 만들지 못한다.
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		dog.breath();
		cat.breath();
		bird.breath();
		
		dog.sound();
		cat.sound();
		bird.sound();
		
		dog.move();
		cat.move();
		bird.move();
		
		// 3. 다형성
		animalsound(dog);
		animalsound(cat);
		animalsound(bird);
		animalsound(new 사자());
		animalsound(new 호랑이());
		
		
	}

	public static void animalsound(Animal animal) {
		animal.sound();
	}
	public static void animalmove(Animal animal) {
		animal.move();
	}
		
	
//	public static void animalsound(Dog dog) {
//		dog.sound();		
//	}
//	public static void animalsound(Cat cat) {
//		cat.sound();		
//	}
//	public static void animalsound(Bird bird) {
//		bird.sound();		
//	}
	
}

class 사자 extends Animal{

	@Override
	void move() {
		System.out.println("쿵~! 쿵~!");
		
	}

	@Override
	void sound() {
		System.out.println("어흥!!!!");
	}}
class 호랑이 extends Animal{

	@Override
	void move() {
		System.out.println("어슬렁~어슬렁~");
	}

	@Override
	void sound() {
		System.out.println("어흥~~~~");
	}}
