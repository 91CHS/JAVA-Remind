package com.lec.ex01_class;

public class HumanMain {

	public static void main(String[] args) {
		
		String str1 = new String();
		String str2 = new String();

		Human hong = new Human();
		Human kim = new Human();
		Human park = new Human();

		
		Human adam = new Human();
		Human eve = new Human();
		
		adam.name = "아담";
		adam.gender = "남자";
		adam.age = 10000;
		
		eve.name = "이브";
		eve.gender = "여자";
		eve.age = 10000;
				
		System.out.println(adam.name);
		System.out.println(adam.gender);
		System.out.println(adam.age);
		System.out.println();
		
		System.out.println(eve.name);
		System.out.println(eve.gender);
		System.out.println(eve.age);
		System.out.println();
		
		
		// 2. 생성자 : 기본생성자 vs 기본생성자외
		String spider = new String();
		System.out.println("spider =" + spider);
		
		String sohyang = new String("소향");
		System.out.println("sohyang =" + sohyang);
		
		Human sonny = new Human("손흥민");
		System.out.println("sonny = " + sonny.name);
		System.out.println("sonny = " + sonny.gender);
		System.out.println("sonny = " + sonny.age);
		
		// 실습1. 강인의 이름과 성별,나이를 출력
		Human kangin = new Human("이강인","남자");
		kangin.age=21;
		System.out.println("kangin = " + kangin.name);
		System.out.println("kangin = " + kangin.gender);
		System.out.println("kangin = " + kangin.age);
		// 실습2. 김민재의 이름과 성별과 나이를 출력
		Human minjae = new Human("김민재","남자",20);
		System.out.println("minjae = " + minjae.name);
		System.out.println("minjae = " + minjae.gender);
		System.out.println("minjae = " + minjae.age);
		
		// 실습3. 메시의 이름,나이,성별순서 생성자호출
		Human messi = new Human("메시",10,"여자");
		System.out.println("messi = " + messi.name);
		System.out.println("messi = " + messi.gender);
		System.out.println("messi = " + messi.age);
		System.out.println("------------------------------------");
	
		// 3. 메서드
		kangin.move();
		minjae.move(minjae.name);
		
		sonny.move();
		kangin.think();
		minjae.speak();
		sonny.eat();
	
	
	
	
	}
		
	
}
