package com.lec.ex06_class;

public class American extends Adam {

	 @Override
	void speak() {
		System.out.println("영어로 말을 합니다.");
	}
	 
	 @Override
	void move() {
		System.out.println("패배자가 됩니다.");
	}

	@Override
	public String toString() {
		return "American{" +
				"nation='" + nation + '\'' +
				", name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", age=" + age +
				'}';
	}
}
