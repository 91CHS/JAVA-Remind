package com.robot.v6_method;

import java.util.Iterator;

import com.robot.impl.*;
import com.robot.inter.*;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V6.0 (공통메서드) ===");
		System.out.println();
		
		Robot robot = null;
		
		robot = new CheapRobot("Cheap", 5);
		makeRobot(robot, new FlyNo(), new MissileNo(), new UltraJJang());
		
		robot = new StandardRobot("Standard", 10);
		makeRobot(robot, new FlyYes(), new MissileYes(), new SwordLaser());

		robot = new SuperRobot("Super", 5);
		makeRobot(robot, new FlyYes(), new MissileYes(), new UltraJJang());
		
	}

	private static void makeRobot(Robot robot, InterFly fly, InterMissile missile, InterSword sword) {
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(fly);
		robot.setMissile(missile);
		robot.setSword(sword);
		robot.actionFly();
		robot.actionMissile();
		robot.actionSword();
		System.out.println(robot.name + "Robot의 생산수량 = " + robot.qty);
		System.out.println();
	}
	
	// 실습1. makeRobot을 Robot의 생성자로 Refactoring
	// 실습2. Cheap, Standard, Super을 없애고 Robot클래스 한개만 작성??
	// 실습3. 매개변수의 다형성 -> setter없이 action???메서드만 가지고 작성???
}


















