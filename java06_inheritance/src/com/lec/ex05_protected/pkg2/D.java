package com.lec.ex05_protected.pkg2;

import com.lec.ex05_protected.pkg1.A;

public class D extends A {
		
	public D() {
		// A a = new A(); // protected 직접접근불가
		super(); // 상속관계일 경우 부모생성자 접근가능
		field1 = "";
		//this.field2 = ""; private이라 안됨
		method_a(); // 상속관계일 경우 부모메서드 접근가능
		
	}
}
