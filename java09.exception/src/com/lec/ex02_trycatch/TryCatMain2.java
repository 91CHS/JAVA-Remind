package com.lec.ex02_trycatch;

public class TryCatMain2 {

	public static void main(String[] args) {
		
		// 2. 실행예외
		String data1 = null;
		String data2 = null;
		
		//Class _class = Class.forName("java.lang.Stringxxx"); // 일반에러는 컴파일시 에러가 발생해서 처리해줘야함
		//data1 = args[0];  // 실행예외문은 실행해야 알 수 있음.
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행할 매개변수가 부족합니다!");
			e.printStackTrace();
			System.out.println(e.getMessage());  // Index 0 out of bounds for length 0
			return;
		}
		System.out.println();
		
		System.out.println(data1 + "," + data2); // 위에서 return해서 처리해버림. 안 살아있음. 
		
		try {
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println("더하기 결과 = " + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환이 불가능합니다!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("프로그램을 종료합니다!!");
		}
	}

}
