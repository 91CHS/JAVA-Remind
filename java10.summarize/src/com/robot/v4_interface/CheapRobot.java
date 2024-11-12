package com.robot.v4_interface;
import com.robot.inter.InterFly;
import com.robot.inter.InterMissile;
import com.robot.inter.InterSword;

// 상속클래스인 Robot을 상속했고, 인터페이스 3가지를 임폴트 해줬음!!!
public class CheapRobot extends Robot {
	
	// 상속클래스인 로봇을 상속해서 abstract 부분을 모두 써야함
	// abstract 부분은 actionFly();  actionMissile();  actionSword();
	private InterFly fly;
	private InterMissile missile;
	private InterSword sword;
	
	
	public CheapRobot(String name, int qty) {
		super(name, qty);
	}   // 생성자는 부모의 생성자를 따라갈 수 밖에 없음

	@Override
	public void actionFly() {fly.Fly();}
	// InterFly fly 객체를 만들어서 Fly();를 사용할 수 있게 했다.
	public void actionMissile() {missile.Missile();}
	public void actionSword() {	sword.Sword();}

	public void setFly(InterFly fly) {this.fly = fly;}
	// private InterFly fly 객체를 변동할 수 있는 setter를 만들어줌.
	// 객체값을 setFly메서드를 통해 변동시킬 수 있음.
	public void setMissile(InterMissile missile) {this.missile = missile;}
	public void setSword(InterSword sword) {this.sword = sword;}

}
