package com.lec.ex04_class;

public class HumanMain {

	public static void main(String[] args) {

		
		// 메서드오버라이딩
		Adam adam = new Adam();
		Eve eve = new Eve();
		
		System.out.print(adam.name + ",");
		System.out.print(adam.gender + ",");
		System.out.print(adam.age);
		adam.speak();
		String msg = adam.move();
		System.out.println(adam.toString());
		System.out.println();
		
		System.out.println(eve.toString());
		System.out.println(eve.move());
		eve.speak();
		msg = eve.move();
		System.out.println(msg);
		System.out.println(eve.toString());

	}

}
