package com.lec.ex10_abstract.method;

public class Bird extends Animal {

	@Override
	void sound() {
		System.out.println("짹~!짹~!");
	}

	@Override
	void move() {
		System.out.println("날아다닌다.");
	}
}
