package com.lec.ex05_field;

public class Car {
		
		Tire fl = new BigwidthTire();
		Tire fr = new BigwidthTire();
		Tire bl = new BigwidthTire();
		Tire br = new BigwidthTire();
		
		
		void run() {
			fl.roll();
			fr.roll();
			bl.roll();
			br.roll();
						
		}
}
