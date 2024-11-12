package com.robot.v2_inheritance;

public class SuperRobot extends Robot {

	public SuperRobot(String name, int qty) {
		super(name, qty);
	}

	public void actionFly() {System.out.println("날 수 있어요");}
	public void actionMissile() {System.out.println("핵미사일을 쏠 수 있어요");}
	public void actionSword() {System.out.println("광선검이 있어요");}
	
}