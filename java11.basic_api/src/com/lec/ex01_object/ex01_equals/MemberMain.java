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
		
		// 해쉬코드를 비교가 우선. 해쉬코드가 다르면 다른놈이다!
		
		System.out.println(member1.equals(member2)); // false
		System.out.println(member1.equals(member3)); // false
		System.out.println();
		
		
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
