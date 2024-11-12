package com.lec.ex08_instanceof;

public class Driver {
	
	void drive(Vehicle vehicle) {
		
//		Bus bus = (Bus)vehicle;
//		bus.run();
//		bus.checkFare();
		
//		Taxi taxi = (Taxi) vehicle;
//		taxi.run();
//		taxi.xxx();
		
		//instanceof를 사용해서 두가지 합치기
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.run();
			bus.checkFare();
		} else if (vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.run();
			taxi.xxx();
		} else {
			vehicle.run();
		}
	}
}
