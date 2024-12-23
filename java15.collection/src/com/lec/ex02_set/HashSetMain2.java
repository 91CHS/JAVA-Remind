package com.lec.ex02_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain2 {

	public static void main(String[] args) {
		// 이전에 실습했던 String은 중복 저장 안되게 hashCode와 equals이 재정의 되어있다.
		// 이번 실습은 Member클래스를 내가 만들어서 쓰기 때문에 hashCode와 equals를 재정의해야한다.
		
		Set<Member> members = new HashSet<>();
		
		members.add(new Member("손흥민",30));
		members.add(new Member("이강인",21));
		members.add(new Member("손흥민",30));
		members.add(new Member("손흥민",20));
		System.out.println("총 객체수 = " + members.size());
		
		for(Member member:members) {
			System.out.println(member.toString() + ", " + member.hashCode());
		}

	}

}

class Member {
	
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	@Override                 // 해쉬코드 재정의. 같은놈들 해쉬코드 같게 만듬.
	public int hashCode() {
		return this.name.hashCode() + age;  // 이름와 나이 같으면 같은 해쉬코드로 만들기.
	}										// age는 기본타입이라서 hash코드가 따로 없다.
	
	@Override
	public boolean equals(Object obj) {
		// name과 age가 같을 경우에는 동일한 객체로 판단해서 true를 리턴하고
		// 아닐경우에는 false가 리턴되도록 equals메서드를 재정의
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return (member.name.equals(this.name) && (member.age == this.age));
		} else {
		return false;
	}
	//  hashCode와 equals를 재정의해서 객체를 생성할 때 중복을 안 넣는다.
	}	
}