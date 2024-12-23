package com.lec.ex09_instance;
/*
 	객체타입확인(InstanceOf)
 	
 	강제타입변환은 자식객체에서 부모객체로 타입변환이 되어 있는 상태에서만 가능하기 때문에
 	부모타입의 변수가 부모객체를 참조할 경우 자식타입으로 변환할 수가 없다.
 	어떤 객체가 어느 클래스의 인스턴스(객체)인지 확인하려면 instanceOf 연산자를 사용할 수가 있다.
 	
 	예를들어
 	Parent parent = new Parent();
	Child child = (Child) parent;  <- 강제형변환불가, 예외발생
 	
 	instanceOf연산자는 좌측항은 객체가 오고 우측항은 참조타입이 오는데
 	좌측항의 객체가 우측항의 인스턴스(객체)가 아니면 false,
 	우측항의 타입으 생성된 인스턴스(객체)라면 true를 리턴한다.
 	
 	instanceOf 연산자는 매개값의 타입을 조사할 때 주로 사용한다. 메서드내에서 강제타입변환이
 	필요한 경우 반드시 매개값이 어떤 객체타입인지 instanceOf연산자로 확인하고 안전하게 강제타입
 	변환해야 한다.
 	
 	만약, 타입을 확인하지 않고 강제타입변환을 시도할 경우,
 	강제타입변환이 되지 않을 경우가 발생하면 ClassCastException예외가 발생한다.
 	
 	
 	
 */
public class InstanceOfMain {

	public static void main(String[] args) {
		
		// 강제형변환불가 : ClassCastException
		//Parent parent = new Parent();
		//Child child = (Child) parent;
		
		Parent parentA = new Parent();
		
//		method1(parentA); // 단순 부모로 만들어서 강제형변환이 필요한 메소드는 실패함.
		method2(parentA);
		System.out.println();
		
		Parent parentB = new Child();
		method1(parentB);
		method2(parentB);
	}

	static void method1(Parent parent) {
		System.out.println(parent.getClass());
		Child child = (Child) parent;
		System.out.println("강제변환성공?실패? - 중요한 로직!!");
		
	}

	static void method2(Parent parent) {
		System.out.println(parent.getClass());
		if(parent instanceof Child) {   // parent 객체가 Child class로 만든 객체라면 true
			Child child = (Child) parent;
			System.out.println("강제형변환성공!! - 중요한 로직!!");
		} else {
			System.out.println("강제형변환실패!! - 중요한 로직이 실행되지 않았습니다.");
		}
		
	}
   
}
