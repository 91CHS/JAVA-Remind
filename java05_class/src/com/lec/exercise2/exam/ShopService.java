package com.lec.exercise2.exam;

//		class Singleton{
//			private Singleton() {}                                  //  프라이빗 기본생성자
//			private static Singleton singleton = new Singleton();   //  프라이빗 스태틱 생성자를 클래스내에 만들기
//			public static Singleton getInstance() {                 //  프라이빗 생성자를 리턴하는 퍼블릭 메서드 만들기
//				return singleton;                                   //  위 메서드를 통해서 외부에서 사용하기
//			}
//		}

public class ShopService {
	
    	private static ShopService shopservice  = new ShopService();
	  
    	private ShopService() {}
	 
   	    public static ShopService getInstance() {
		return shopservice;
	 }
	
		
}
