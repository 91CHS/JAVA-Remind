package com.lec.ex07_typechange;

public class DriverMain {

	public static void main(String[] args) {


		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare(); 자식(구현된Bus)에서 부모(interface checkFare)로 자동형변환시 짤림. 클래스의 변형환과 동일
		System.out.println();
		
		
		
		
		
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare(); // 부모로 갔다가 다시 강제형변환. 그대로 쓸 수 있음.
	}

}
