package com.lec.ex01_object.ex04_clone.thin;

public class MemberMain {

	public static void main(String[] args) {

		// 예시가 조금 잘못됨. String은 불변객체라서 복제된 참조변수타입을 변경시 원본 객체가 변한다는 걸 보여줄 수 없다.
		// String은 값을 변경하면 기존 객체 값만 변경하는게 아니라 새로운 객체를 만들어 참조한다.

		// 1. 원본객체
		Member org_member = new Member("hong","홍길동","12345",1000,true);
		// 2. 복제객체
		Member clone_member = org_member.getMember();

		System.out.println(clone_member.password.hashCode());
		System.out.println(org_member.password.hashCode());

		// 복제 후 password 변경
		System.out.println("변경전 패스워드 = " + org_member.password);
		clone_member.password = "67890";
		System.out.println();
		
		System.out.println("[복제객체]");
		System.out.println(clone_member.id);
		System.out.println(clone_member.name);
		System.out.println(clone_member.password);
		System.out.println(clone_member.age);
		System.out.println(clone_member.adult);
		System.out.println();
		
		System.out.println(clone_member.hashCode()); // 비번 바꾸고 객체 해시코드 변경됨
		System.out.println(org_member.hashCode());
		System.out.println();
		
		System.out.println(clone_member.password.hashCode()); // 비번의 해시코드 다름
		System.out.println(org_member.password.hashCode());
		System.out.println(clone_member.id.hashCode()); // id의 해시코드는 동일
		System.out.println(org_member.id.hashCode());
		System.out.println("--------------------------------");
		
		System.out.println(clone_member.scores.hashCode());// scores의 해시코드는 동일
		System.out.println(org_member.scores.hashCode());
		System.out.println();
		
		System.out.println("원본 : 변경전 점수[0] =" + org_member.scores[0]);
		System.out.println("원본 : 변경전 점수[0] =" + clone_member.scores[0]);
		org_member.scores[0] = 100; // 원본변경
		System.out.println("원본 : 변경전 점수[0] =" + org_member.scores[0]);
		System.out.println("원본 : 변경전 점수[0] =" + clone_member.scores[0]); // 원본 변경하니, 복제품도 변경됨.
		
	}

}
