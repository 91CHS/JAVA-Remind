package com.lec.ex10_abstract.method;

public class Dog extends Animal {
	
	@Override
	void sound() {
		System.out.println("멍!!멍!!");
	}

	@Override
	void move() {
		System.out.println("뛰어다닌다");
		
	}
}
