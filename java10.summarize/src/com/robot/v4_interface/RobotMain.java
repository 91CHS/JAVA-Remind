package com.robot.v4_interface;

import com.robot.impl.*;


public class RobotMain {

	public static void main(String[] args) {
		System.out.println("=== Robot V4.0 (인터페이스) ===");
		System.out.println();

		CheapRobot cheapRobot = new CheapRobot("Cheap",5);
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		
		cheapRobot.setFly(new FlyNo());
		cheapRobot.setMissile(new MissileNo());
		cheapRobot.setSword(new SwordNo());
		
		cheapRobot.actionFly();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		
		System.out.println(cheapRobot.name + "Robot의 재고수량 = " + cheapRobot.qty);
		System.out.println();
		
		StandardRobot standardRobot = new StandardRobot("Standard",10);
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		
		standardRobot.setFly(new FlyNo());
		standardRobot.setMissile(new MissileYes());
		standardRobot.setSword(new SwordWood());
				
		standardRobot.actionFly();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		System.out.println(standardRobot.name + "Robot의 재고수량 = " + standardRobot.qty);
		System.out.println();
		SuperRobot superRobot = new SuperRobot("Super",5);
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		
		superRobot.setFly(new FlyYes());
		superRobot.setMissile(new MissileYes());
		superRobot.setSword(new UltraJJang());
				
		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println(superRobot.name + "Robot의 재고수량 = " + superRobot.qty);
		

	}

}
