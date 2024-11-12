package com.lec.ex10_abstract.method;

public class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야옹~~~~");
	}

	@Override
	void move() {
		System.out.println("도망다닌다");
	}
}
