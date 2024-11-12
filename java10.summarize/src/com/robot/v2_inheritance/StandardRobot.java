package com.robot.v2_inheritance;

public class StandardRobot extends Robot {

	public StandardRobot(String name, int qty) {
		super(name, qty);
	}

	public void actionFly() {System.out.println("날 수 없어요");}
	public void actionMissile() {System.out.println("미사일을 쏠 수 있어요");}
	public void actionSword() {System.out.println("사무라이검이 있어요");}
}
