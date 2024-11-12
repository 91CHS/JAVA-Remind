package com.lec.ex02_trycatch;

public class TryCatMain1 {

	public static void main(String[] args) {
		
		//Class _class = Class.forName("java.lang.String"); 
		 // main 에 throw로 던질수 있음.
		
		
		// 1. 일반예외
		try {
			Class _class = Class.forName("java.lang.Stringxxx");
			System.out.println("클래스를 찾았습니다.");
		} catch (Exception e) {
			System.out.println("클래스를 찾지 못했습니다!!"); // 1.내가 처리 
			System.out.println();
			
			e.printStackTrace();              // 2. 기본처리 (빨간글씨 가득)
			System.out.println();
						
			System.out.println(e.getMessage()); // 3.  java.lang.Stringxxx
		}

	}

}
