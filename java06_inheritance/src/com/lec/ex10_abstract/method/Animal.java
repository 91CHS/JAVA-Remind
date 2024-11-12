package com.lec.ex10_abstract.method;

public abstract class Animal {

		public String kind;
		
		void breath() {System.out.println("Heart beat!!");}
//		void sound() {System.out.println("대부분 소리를 낸다.");}
		abstract void move(); // {} 실행문이 없는대신 abstract를 사용하고,
		                      // 클래스에 abstract이 있어야하며
		                      // 상속받은 클래스에 재정의해줘야 한다.
		abstract void sound();
}
