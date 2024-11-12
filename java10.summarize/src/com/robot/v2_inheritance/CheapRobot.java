package com.robot.v2_inheritance;

public class CheapRobot extends Robot {

	public CheapRobot(String name, int qty) {
		super(name, qty);
	}
	
	public void actionFly() {System.out.println("날 수 없어요");}
	public void actionMissile() {System.out.println("미사일이 없어요");}
	public void actionSword() {System.out.println("칼이 없어요");}
	
}
