package com.lec.ex03_compare;

public class ConditionalOperatorMain {

	public static void main(String[] args) {
		// 삼항연산자 (조건식) ? true일경우 : false일경우
        // 3개의 피연산자가 필요로 하는 연산자를 말한다.
		// 삼항연산자는 ? 앞의 조건식의 결과에 따라서 앞뒤의
		// 피연산자가 선택된다고해서 조건연산식이라고도 한다.
		
		int score = 85;
		
		//기본 if
		if (score>=90) {
			 System.out.println("A학점");
		} else {
			 System.out.println("B학점");
		}
		
		//삼항연산자
	    //(score>=90) ? System.out.println("A학점") : System.out.println("B학점"); // 문법에러
		char grade = (score>=90) ? 'A' : 'B';
		System.out.println(grade + "학점");
		
		
	}

}
