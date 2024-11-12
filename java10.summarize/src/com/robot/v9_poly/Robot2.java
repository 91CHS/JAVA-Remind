package com.robot.v9_poly;

import com.robot.inter.InterFly;
import com.robot.inter.InterMissile;
import com.robot.inter.InterSword;

public class Robot2 {
	
	public String name;
	public int qty;
	
	private InterFly fly;
	private InterMissile missile;
	private InterSword sword;

	public Robot2(String name, int qty, InterFly fly, InterMissile missile, InterSword sword) {
		this.name = name;
		this.qty = qty;
		this.fly = fly;
		this.missile = missile;
		this.sword = sword;
	}
	
	//공통기능
	public void shape() {System.out.println(this.name+"Robot입니다! 팔,다리,머리,몸통이 있습니다.");}
	public void actionWalk() {System.out.println("걸을 수가 있습니다.");}
	public void actionRun() {System.out.println("달릴 수가 있어요");}
	
	//메서드의 다형성
	
	public void actionFly(InterFly fly) {fly.Fly();}
	public void actionMissile(InterMissile missile) {missile.Missile();}
	public void actionSword(InterSword sword) {sword.Sword();}
	
	private void makeRobot(InterFly fly, InterMissile missile, InterSword sword) {
		shape();
		actionWalk();
		actionRun();
		actionFly(fly);
		actionMissile(missile);
		actionSword(sword);

	}

	@Override
	public String toString() {
		return this.name + "Robot의 생산수량 =" + this.qty;
	}
	
	
}
