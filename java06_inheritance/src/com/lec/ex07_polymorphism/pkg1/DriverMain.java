package com.lec.ex07_polymorphism.pkg1;
// 다형성 이용하기 전, Driver class를 보면 메서드가 점점 많아짐.
public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive();
		Vechicle vechicle = new Vechicle();
		vechicle.run();
		driver.drive(vechicle);
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
	}

}
