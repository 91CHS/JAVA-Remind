package com.robot.v8_final;

import com.robot.impl.*;
import com.robot.v7_constructor.*;



public class RobotMain {

	public static void main(String[] args) {
		System.out.println("=== Robot V8.0 (최종) ===");
		System.out.println();		
		
		Robot robot =null;
		
		robot = new Robot("CheapRobot",5, new FlyYes(), new MissileNo(), new SwordNo());
		robot.makeRobot();
		System.out.println(robot.toString() + "\n");
		
		robot = new Robot("Standard", 10, new FlyYes(), new MissileNo(), new UltraJJang());
		robot.makeRobot();
		System.out.println(robot.toString() + "\n");		
		
		robot = new Robot("Super", 10, new FlyYes(), new MissileYes(), new UltraJJang());
		robot.makeRobot();
		System.out.println(robot.toString() + "\n");	
		
		// 한공장에서 뽑아낼 수 있다.
		// 아직까진 setter, getter 개념이 들어가 있다.
	}

}
