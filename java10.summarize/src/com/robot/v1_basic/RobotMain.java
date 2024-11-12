package com.robot.v1_basic;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V1.0 (기본) ===");
		System.out.println();
		
		CheapRobot cheaprobot = new CheapRobot(5);
		cheaprobot.shape();
		cheaprobot.actionWalk();
		cheaprobot.actionRun();
		cheaprobot.actinFly();
		cheaprobot.actionMissile();
		cheaprobot.actionSword();
		System.out.println("Cheaprobot의 재고수량= " + cheaprobot.qty);
		System.out.println();
		StandardRobot standardRobot = new StandardRobot(10);
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actinFly();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		System.out.println("StandardRobot의 재고수량= " + standardRobot.qty);
		System.out.println();
		SuperRobot superRobot = new SuperRobot(5);
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actinFly();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println("SuperRobot의 재고수량= " + superRobot.qty);
		
		
		
		
		
	}

}
