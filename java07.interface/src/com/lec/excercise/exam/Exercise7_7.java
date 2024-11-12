package com.lec.excercise.exam;

public class Exercise7_7 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
		System.out.println("x="+c.getX());

	}

}

class Parent {
	int x = 100;  //필드
	
	Parent() {this(200);}  //생성자
	
	Parent(int x) {this.x = x;} // 생성자
	
	int getX() {return x;} // 메소드
}


class Child extends Parent {
	int x = 3000;
	
	Child() {this(1000);}   ///
	
	Child(int x) {this.x = x;}
	
}


