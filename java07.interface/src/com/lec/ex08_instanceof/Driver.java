package com.lec.ex08_instanceof;

public class Driver {
	
	void drive(Vehicle vehicle) {
//		버스가 들어왔을때 가능
//		Bus bus = (Bus)vehicle;
//		bus.run();
//		bus.checkFare();

//		택시가 들어왔을때 가능
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
