package com.lec.ex01_runtime;

public class ArrayIndexOutOfBoundsMain {

	public static void main(String[] args) {
		
		// java.exe ~.class a b c  : 이런식으로 명령프롬프트에서 a b c 값 추가 가능하지만 보통 Configuration씀.
		String data1 = args[0];  // Run / Configuration / Arguments 가서 '홍길동 김민재' 추가
		String data2 = args[1];
		
		System.out.println(args[0]);
		System.out.println(args[1]);

		System.out.println(args[2]);   // 인덱스2가 없어서 에러 발생 ArrayIndexOutOfBoundsException
	}

}
