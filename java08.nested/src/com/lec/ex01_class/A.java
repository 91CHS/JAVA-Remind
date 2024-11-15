package com.lec.ex01_class;

public class A {
	
	//생성자
	public A() {System.out.println("A객체 생성");}
	
	// 1. 객체멤버인 중첩클래스
	// A가 생성되어야만 사용할 수 있다.
	public class B {
		//1.필드
		int b_field1;
		//static String name; //B는 객체가 생성이 되어야 하는 객체멤버이기 때문 static불가 
		//2.생성자
		public B() {System.out.println("B객체 생성!!");}
		//3.메서드
		void b_method1() {System.out.println("B_bmethod1() 호출!!");}
		//static void b_method2() {} //static은선언불가 
	}
	
	
	// 2. 정적멤버인 중첩클래스(static)
	// static, A가 생성되지 않아도 사용할 수 있다.
	public static class C {
		int c_field1;
		static int c_field2;
		public C() {System.out.println("C객체 생성!!");}
		void c_method1() {System.out.println("C.c_method1() 호출!!");}
		static void c_method2() {System.out.println("C.c_method2() 호출!!");}
	
	}
	
//	 3. 로컬멤버인 중첩클래스(메소드안에 있는)
//	 메서드안에서만 사용할 수 있다. 메서드가 호출되어야 생성되고 사용할 수 있다.
	public void a_method() {
		class D {
			int d_field1;
			//static int d_field2;
			public D() {System.out.println("D객체 생성!!");}
			void d_method1() {System.out.println("D.d_method1 호출!!");}
			// static void d_method2() {} ;
			}
		
		D d = new D();
		d.d_field1 = 100;
		d.d_method1();
		
		
		
		class E {}
		class F {
			class G {}
			}
	}
}
