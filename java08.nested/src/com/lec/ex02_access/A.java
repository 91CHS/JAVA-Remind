package com.lec.ex02_access;
// 내부의 중첩클래스에서 외부로 접근할때 알아보자
public class A {
	//필드
	int a_field1;
	static int a_field2;
	
	//생성자
	//메서드
	void a_method1() {};
	static void a_method2() {};
	
	//1. 객체멤버중첩클래스 - 객체멤버,정적멤버 모두 접근가능
	class B {
		void b_method1() {
			a_field1 = 100;
			a_field2 = 200;
			a_method1();
			a_method2();
		}
	}
	
	//2. 정적멤버중첩클래스 - 정적멤버만 접근가능
	static class C {
		void c_method1() {
//			a_field1 = 100;
			a_field2 = 200;  // static
//			a_method1();
			a_method2();  // static
		}
	}
}
