package com.robot.v9_poly;

import com.robot.impl.*;


// setter, getter 없이 만들어보기!!!!

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("=== Robot V9.0 (다형성(생성자,메서드) ===");
		System.out.println();

		Robot robot =null;
		
		robot = new Robot("CheapRobot",5);
		robot.makeRobot(new FlyYes(), new MissileNo(), new SwordNo());
		System.out.println(robot.toString() + "\n");
		
		robot = new Robot("Standard",10);
		robot.makeRobot(new FlyYes(), new MissileNo(), new UltraJJang());
		System.out.println(robot.toString() + "\n");
		
		robot = new Robot("Super",5);
		robot.makeRobot(new FlyYes(), new MissileYes(), new UltraJJang());
		System.out.println(robot.toString() + "\n");
		
	}

}
