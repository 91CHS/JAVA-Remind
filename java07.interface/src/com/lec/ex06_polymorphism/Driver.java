package com.lec.ex06_polymorphism;

public class Driver {
	
	void drive(탈것 v) {
		v.run();
	}
	
	void drive(오토바이 auto) {
		auto.run(); 
	}
} 
