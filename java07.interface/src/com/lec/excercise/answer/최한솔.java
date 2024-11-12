package com.lec.excercise.answer;


public class 최한솔 {
	
//	7-1.
//	7-2.
	
//	7-3. 오버라이딩의 정의와 필요성
//	    오버라이딩이란, 부모의 메서드를 재정의하는 것으로
//	    자식클래스에 맞게 수정하는 것이다. 
	
//	7-4.다음 중 오버라딩의 조건으로 옳지 않은것을 모두 고르시오.
//	   a o
//	   b o          정답은 : c,d
//	   c x
//	   d x
	
	
//	7-5.컴파일에러발생, 이유와 수정
//	Tv(int price) {
//		super(price);
//	} 
	// 부모인 Prodect의 생성자를 따라 매개변수를 넣어줘야하고, 부모의 메서드를 호출하기 위해서
	// super에 값을 넣어준다.
	
//	class Exercise7_5 {
//		public static void main(String[] args) {
//			Tv t = new Tv(1000);
//			System.out.println("가격 = " + t.price + ", " + "보너스 = " + t.bonusPoint);
//		}   
//	}
	// Tv에는 price즉 int타입의 수를 넣어줘야 한다.
	
//	7-6.자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야 하는 이유는?
//		자손의 객체를 생성하려면 먼저 조상의 객체가 생성되어야 한다.
      
//	7-7.생성자의 순서와 실행결과
//	Child c = new Child();에서
//	자식객체가 만들어질때 부모객체가 먼저 만들어진다.
//	super(); 즉, Parent()가 생성되면 x = 200이다.
//	Child()가 생성되면 x = 1000이다.
//	System.out.println("x="+c.getX());에서
//	c.getX() 메서드 실행하면 부모객체 Parent()의 메서드 getX()가 실행되므로
//	return값 200이다.
	
//	7-8. 접근범위 답 : a
	
//	7-9. final 설명 옳지 않은 것 모두
//	   a o  
//	   b o  
//	   c x  오버라이딩 할수 없다<<
//	   d o  
	

}
