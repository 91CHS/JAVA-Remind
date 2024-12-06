package com.lec.ex01_object.ex02_hashcode;

public class KeyMain {
	
	public static void main(String[] args) {
		

		// 지금보니 예시가 잘못된 것 같다. 각각 Integer와 String의 재정의된 메소드를 쓰기 때문이다.
	Object object1 = 0;
	Object object2 = 0;
	Object object3 = "0";
	Object object4 = new String("0");
	
	System.out.println(object1.hashCode()); // 0 : Integer는 정수값 자체를 해쉬코드로 반환
	System.out.println(object2.hashCode()); // 0
	System.out.println(object3.hashCode()); // 48 : String에서 hashCode는 내용을 기반으로 동일한 해쉬코드값을 리턴
	System.out.println(object4.hashCode()); // 48
	System.out.println();
	
	System.out.println(object1 == object2); //true
	System.out.println(object1 == object3); //false
	System.out.println(object1 == object4);	//false
	System.out.println();
	
	System.out.println(object1.equals(object2));	//true
	System.out.println(object1.equals(object3));	//false
	System.out.println(object1.equals(object4));	//false
	System.out.println();
	
	System.out.println(object1.toString()); // 0 : Integer의 toString은 값을 문자열로 리턴
	System.out.println(object2.toString()); // 0
	System.out.println(object3.toString()); // 0 : String의 toString은 문자열 리턴
	System.out.println(object4.toString()); // 0
	System.out.println("===============================");
	
	Key key1 = new Key(0);
	Key key2 = new Key(0);
	System.out.println(key1.hashCode()); // 0 : 값을 리턴하는 것으로 재정의 했기 때문
	System.out.println(key2.hashCode()); // 0
	System.out.println(key1 == key2);	//false : 주소값을 비교하는 동등비교자
	System.out.println(key1.equals(key2)); //true : 값을 비교하는 것으로 재정의 했기 때문
	System.out.println(key1.toString()); // com.lec.ex01_object.ex02_hashcode.Key@0
	System.out.println(key2.toString());
	System.out.println();
	
	System.out.println(key1.hashCode() == key2.hashCode()); //true <- 값이 같은가?
	
	
	
	
	
	}
}
