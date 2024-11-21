package com.lec.excercise.exam;

public class Exercise7_7 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);  // 1000   int x 겹치므로 기본적으로는 자식 필드값
		System.out.println("x="+c.getX()) ; // 200  그러나 부모의 필드를 뽑는 부모의 메서드를 사용하면 다름

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


