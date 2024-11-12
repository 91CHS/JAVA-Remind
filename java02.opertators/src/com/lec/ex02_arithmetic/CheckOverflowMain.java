package com.lec.ex02_arithmetic;

public class CheckOverflowMain {

	public static void main(String[] args) {
//		int result = 2000000000 + 2000000000;
//		System.out.println(result);
		
		System.out.println("int타입의 최소값 = " + Integer.MIN_VALUE);
		System.out.println("int타입의 최대값 = " + Integer.MAX_VALUE);
		
		try {
		int result = safeAdd(-2000000000, -2000000000);
		System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("Overflow가 발생해서 정확한 연산을 수행할 수가 없습니다!!!");
		}
	}
	
	public static int safeAdd(int left, int right) {
		
		if(right>0) {
			 if(left > Integer.MAX_VALUE - right) {
				 // 사용자가 강제로 예외를 발생시키는 방법
				 throw new ArithmeticException("Overflow가 발생했습니다!");
			 }
		} else {
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("Underflow가 발생했습니다!");				
			}
		}
		return left + right;
	}
}
