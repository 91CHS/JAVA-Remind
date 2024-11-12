package com.lec.exercise.answer;

public class 최한솔 {

	public static void main(String[] args) {
		
		// 8-1 예외처리의 정의와 목적
//		사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류인 예외를 처리하기 위해서 해줘야한다.
//		일반예외의 경우 컴파일시 오류가 발생하고, 실행예외의 경우는 컴파일 과정에서 오류가 발생하지 않지만 프로그램 종료되기 때문에
//		일반/실행 예외 모두 처리를 해줘야 한다.
		
		// 8-2 옳지 않은것은?
//		d  main 호출 mathod1 호출 method2 호출 순서이다.
		
		// 8-3 오버라이딩이 잘못된 것을 모두 고르시오.
//		  d,e 오버라이딩시에 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다. 
		
		// 8-4 잘못된 예외처리를 모두 고르시오.
//		   c  Exception에 예외처리할 경우 catch문 가장 마지막에 나와야 한다.
		
		// 8-5 아래 코드의 결과
		
//		1
//		3
//		5
//		1
//		2
//		5
//		6
		
		// 8-6 아래 코드 결과
		
//		3
//		5
		
		// 8-7 아래 코드 결과
		
//		1
		
		// 8-8 예외처리코드 작성
		
//		try{
//
//			input = new Scanner(System.in).nextInt();	
//
//		}catch(InputMismatchException e){
//
//			System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
//
//			continue;
//
//		}
		
		// 8-9 예외클래스 작성
		
//		class UnsupportedFuctionException extends RuntimeException {
//
//			private final int ERR_CODE = 100;
//
//
//
//			UnsupportedFuctionException(String msg, int errCode) { // 생성자
//
//				super(msg);    //조상의 생성자 RuntimeException(String msg)를 호출
//
//				ERR_CODE = errCode;
//
//			}
//
//
//
//			UnsupportedFuctionException(String msg) {
//
//				this(msg, 100); // ERR_CODE를 100(기본값)으로 초기화한다.
//
//			}
//
//
//
//			public int getErrCode() { // 에러코드를 얻을 수 있는 메서드
//
//				return ERR_CODE;
//
//			}
//
//
//
//			public String getMessage() { // Exception의 getMessage()를 오버라이딩 한다.
//
//				return "[" + getErrCode() + "]" + super.getMessage();
//
//			}
//
//		}
		
		// 8-10 아래 코드 결과
		
//		2
//		4
//		7
	}
   
}
