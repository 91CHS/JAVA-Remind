package com.lec.ex18_getset;

public class Car {
	
	private int speed = 0;
	private boolean stop;
	
	//setter
	public void 스피드(int speed) {
		
		
		if (speed >= 100) {
		this.speed = 60;
		} else {
			this.speed = speed;
		}
		
	}

	public int 현재속도() {
		return this.speed;
	}
	
	
//	@Override
//	public String toString() {
//		return "Car [speed=" + speed + ", stop=" + stop + "]";
//	}
}
