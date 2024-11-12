package com.robot.v4_interface;

import com.robot.inter.InterFly;
import com.robot.inter.InterMissile;
import com.robot.inter.InterSword;

public class StandardRobot extends Robot {
	
	private InterFly fly;
	private InterMissile missile;
	private InterSword sword;
	

	public StandardRobot(String name, int qty) {		
		super(name, qty);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionFly() {fly.Fly();}

	@Override
	public void actionMissile() {missile.Missile();}

	@Override
	public void actionSword() {	sword.Sword();}

	public void setFly(InterFly fly) {
		this.fly = fly;
	}

	public void setMissile(InterMissile missile) {
		this.missile = missile;
	}

	public void setSword(InterSword sword) {
		this.sword = sword;
	}

}
