package com.lec.ex01_object.ex01_equals;

/*
   객체비교(equals(Object object))
   
   equals메서드는 매개타입이 Object인데 이 의미는 Java의 모든 객체가 매개값으로
   대입될 수 있다는 것이다. 그 이유는 Object가 최상위 클래이기 때문에 모든 객체는
   Object타입으로 자동변환될 수 있기 때문이다.
   
   Java에서는 두 객체를 비교할 때 동등연산자(==)가 아니라 equals()메서드를 사용한다.
   두 객체를 비교해서 논리적으로 동등하면 true, 그렇지 않으면 false를 리턴한다.

   그런데 equals()은 기본적으로 동등연산자(==)와 같기 때문에 주소값을 비교하므로
   값이 같은지를 비교하기 위해선 오버라이딩을 해줘야한다.
   
   equals메서드를 재정의 할 때 매개값(비교객체)이 기존 객채와 동일타입의 객체인지를
   먼저 확인해야 한다. 그렇지 않으면 ClassCastException이 발생한다.
 */
public class Member {
	
	public String id;
	
	public Member (String id) {
		this.id = id;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member)obj;
//			if(id.equals(member.id)) {
//				return true;
//			}
//		}
//		return false;
//	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Member) {
			return id == ((Member)obj).id;
		} else {
			return false;
		}
	}
}
