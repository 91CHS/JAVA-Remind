package com.lec.ex02_arithmetic;

public class StringConcatMain {

	public static void main(String[] args) {
		// 문자열연결연산자(+)
		// +연산자는 산술연산자, 부호연산자인 동시에 문자열연결연산자이다.
		// 문자열과 다른연산자의 + 연산결과는 String이다
		String str1 = "JDK" + 1.8;
		System.out.println("str1 = " + str1);
		
		String str2 = "JDK" + "의 특징";
		System.out.println("str2 = " + str2);

		String str3 = "JDK" + 3 + 3.0;
		System.out.println("str3 = " + str3);
		
		String str4 = 3 + 3.0 + "JDK";
		System.out.println("str4 = " + str4);
	}

}
