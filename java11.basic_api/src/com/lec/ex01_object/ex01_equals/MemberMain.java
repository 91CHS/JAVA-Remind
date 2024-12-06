package com.lec.ex01_object.ex01_equals;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member1 = new Member("hong");
		Member member2 = new Member("hong");
		Member member3 = new Member("kim");
		
		System.out.println(member1.hashCode()); //1865127310
		System.out.println(member2.hashCode()); //1586600255
		System.out.println(member3.hashCode()); //474675244
		System.out.println();
		
		// 해쉬코드가 다르면 다른 객체다!
		
		System.out.println(member1.equals(member2)); // false
		System.out.println(member1.equals(member3)); // false
		System.out.println();
		
		// equals메소드를 값이 같으면 true가 나오게 오버라이딩 했다.
		// 그렇게 하지 않으면 ==랑 똑같이 해쉬코드 비교를 한다.
		// !!equals메소드는 값비교하기위해 오버라이딩을 하고 사용한다!!
		if(member1.equals(member2)) {
			System.out.println("동일 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		if(member1.equals(member3)) {
			System.out.println("동일 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		
		
		
	}

}
