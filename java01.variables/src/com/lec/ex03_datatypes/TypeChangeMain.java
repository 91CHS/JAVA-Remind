package com.lec.ex03_datatypes;

/*
	형변환(Promotion, Casting)?
	
	모든 리터럴과 변수는 데이터타입이 있다. 프로그램을 작성하다 보면 서로 다른 데이터타입의 값을
	연산하는 경우가 자주 발생하는데 모든 연산은 기본적으로 동일 타입의 데이터만 연산할 수 있다.
	만약, 서로 다른 타입의 연산을 수행하는 경우에는 연산을 수행하기 전에 형변환을 통해 동일 타입의
	데이터타입을 변환해야 한다.
	
	형변환이란? 변수 또는 리터럴의 데이터 타입을 다른 데이터 타입으로 변화하는 것을 말한다. 큰 크기의
	데이터타입에서 작은 크기의 데이터 타입으로 변환하는 것을 "강제형변환(Casting, 명시적)이라고 하고
	작은 크기에서 큰 크기의 데이터 타입으로 변환하는 것을 "자동형변환(Promotion, 묵시적)이라고 한다.
	
	자동형변환은 자동으로 형변환이 되기 때문에 개발자가 별도로 정의할 것이 없지만 수동형변환은 개발자가
	명시적으로 선언해야 한다. 강제형변환은 아래와 같다
	
	데이터타입 변수명 = (데이터타입) 값 or 표현식(변수명 or 연산수행)
*/
public class TypeChangeMain {

	public static void main(String[] args) {
		
		// 1. 자동형변환
		byte b1 = 10;
		int i1 = b1; 
		
		// 2. 강제형변환
		float f1 = (float) 3.14;
		long l1 = 500; // 자동형변환
		long l2 = 500l;
		int i2 = (int) l2; // 강제형변환
		
		// 값이 짤리는 경우
		i1 = (int) 3.141592;
		System.out.println("i1 = " + i1);
		
		byte b2 = (byte) 128;
		System.out.println("b2 = " + b2);
		b2 = (byte) 10000;
		System.out.println("b2 = " + b2);
		
		// 3. 연산시 형변환
		double d2 = 10 + 3.141592; // 자동형변환
		System.out.println("d2 = " + d2);
		
		d2 = (double) 10 + 3.141592; // 강제형변환
		System.out.println("d2 = " + d2);
	}

}

