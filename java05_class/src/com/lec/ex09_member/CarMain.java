package com.lec.ex09_member;

public class CarMain {

	public static void main(String[] args) {
		
		
		Car myCar1 = new Car();
		Car myCar2 = new Car("Model Y");
		Car myCar3 = new Car(120);
		Car myCar4 = new Car("Model Y",120);
		Car myCar5 = new Car(2000,"Model Y");
		Car myCar6 = new Car("Model Y","Red",600,150);

		myCar1.poweron();
		myCar6.poweroff();
		
		System.out.println(myCar1.model);
		myCar1.model = "아이오닉6";
		System.out.println(myCar1.model);
		System.out.println(myCar6.model);
		
		
		
	}

}
