package com.lec.ex02_return;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		FunInterface fi1 = null;
		
		fi1 = (a,b) -> { return a + b ;};
//		fi1 = (a,b) -> { return a * b ;};  하나의 객체로 여러 수행 가능.
		int result = fi1.method(10, 10);
		System.out.println("10 + 10 = " + result);
		System.out.println("20 + 20 = " + fi1.method(20, 20));
		System.out.println();
		
		//리턴값 1개 & 실행문 1개
		fi1 = (x,y) -> x * y;
		result = fi1.method(10, 10);   // result 타입 생략 가능
		System.out.println("10 * 10 = " + result);
		System.out.println("20 * 20 = " + fi1.method(20, 20));
		System.out.println();

		//람다식에 메서드를 정의하기 ********************************************
//		fi1 = (x,y) -> x / y ;
//		result = fi1.method(10, 3);
//		System.out.println("10 / 3 = " + result);
		
		fi1 = (x,y) -> (int)div(x,y);
		result = fi1.method(10, 0);
		System.out.println("10 / 0 = " + result);
		
		result = fi1.method(10, 3);
		System.out.println("10 / 3 = " + result);
		
	}

	private static double div(int x, int y) {
		if(y==0) {
			System.out.println("0으로 나눌 수 없습니다!");
			return 0.0;
		} else {
			double result = x / y;
			return result; 
		}
	}

}

@FunctionalInterface
interface FunInterface {
	int method(int x, int y);
}