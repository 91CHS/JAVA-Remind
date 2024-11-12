package com.robot.v9_poly;

import com.robot.impl.*;

public class RobotMain2 {

	public static void main(String[] args) {
		System.out.println("=== Robot V9.0 (다형성(생성자,메서드) ===");
		System.out.println();

		Robot robot =null;
		
		robot = new Robot("Cheap",5);
		robot.makeRobot(new FlyYes(), new MissileNo(), new SwordNo());
		System.out.println(robot.toString());
		
		
	}

}
