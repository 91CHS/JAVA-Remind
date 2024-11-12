package com.lec.ex10_constructor.othercall;

public class Carmain {

	public static void main(String[] args) {

		// this() - 기본생성자
		Car car1 = new Car();
		Car car2 = new Car("911카메라");
		Car car3 = new Car("911카메라","레드");
		Car car4 = new Car("911카메라","레드",200);

		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		System.out.println(car4.toString());
		
	}

}
