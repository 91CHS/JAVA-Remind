package com.robot.v3_abstract;

public abstract class Robot {
	
	public int qty;
	public String name;
	
	public Robot(String name,int qty) {
		this.qty = qty;
		this.name = name;
	}
	
	public void shape() {System.out.println(this.name+"Robot입니다! 팔,다리,머리,몸통이 있습니다.");}
	public void actionWalk() {System.out.println("걸을 수가 있습니다.");}
	public void actionRun() {System.out.println("달릴 수가 있어요");}
	
	public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void actionSword();

}
