package com.robot.v1_basic;

public class SuperRobot {
	
	public int qty;
	public SuperRobot(int qty) {this.qty=qty;}
	public void shape() {System.out.println("StandardRobot입니다! 팔,다리,머리,몸통이 있습니다.");}
	public void actionWalk() {System.out.println("걸을 수가 있습니다.");}
	public void actionRun() {System.out.println("광속으로 이동이 가능해요");}
	public void actinFly() {System.out.println("날 수 있어요");}
	public void actionMissile() {System.out.println("핵미사일을 쏠 수 있어요");}
	public void actionSword() {System.out.println("광선검이 있어요");}

}
