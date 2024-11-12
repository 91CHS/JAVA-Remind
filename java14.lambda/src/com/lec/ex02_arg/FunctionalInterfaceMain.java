package com.lec.ex02_arg;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		FunInterface fi1 = null;;
		
		fi1 = (int a) -> {
			int result = a +10;
			System.out.println(a + " + 10 = " + result);
		};
		fi1.method(10);
		
		fi1 = a -> { System.out.println(a + " + 10 = " + (a+10)); };  // 결과값1개라서 줄여줌
		fi1.method(100);
		// fi1.method("10");    인터페이스에 타입이 선언되어있다.
		
		fi1 = a -> System.out.println(a + " + 10 = " + (a+10));  // 실행문이 1개라서 줄여줌 
		fi1.method(1000);
		
		
	}

}


@FunctionalInterface
interface FunInterface {
	void method(int a);
}