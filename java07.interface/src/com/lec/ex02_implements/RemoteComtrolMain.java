package com.lec.ex02_implements;

public class RemoteComtrolMain {

	public static void main(String[] args) {
		
//		Audio audio = new Audio();
//		Television tv = new Television();
		// 이렇게 따로 안주고 아래처럼...
		
		RemoteControl rc;
		rc = new Television();
		rc.powerOn();
		rc.setVolumn(5);
		rc.powerOff();
		System.out.println();
		
		rc = new Audio();
		rc.powerOn();
		rc.setVolumn(8);
		rc.powerOff();
		System.out.println();
		
		
	}

}
