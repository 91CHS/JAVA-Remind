package com.lec.ex08_casting;
/*
 	강제타입변환(Casting)
 	
 	강제타입변환은 부모타입을 자식타입으로 변환하는 것을 말한다.
 	형변환이 된다고 해서 모든 부모타입이 자식타입으로 강제형변환할 수 있는 것은 아니다.
 	
 	강제타입변환이 되는 경우에는
*** 자식타입이 부모타입으로 형변환된 후에 자식타입으로 변환이 되는 경우에만 강제타입변환이 될 수 있다.
 	
 	자식타입이 부모타입으로 자동형변환하면 부모타입에 선언된 필드와 메서드만
 	사용할 수가 있다. 자식타입이 부모타입으로 자동형변환이 되면 부모타입에서 선언된 필드와 메서드만
 	사용할 수 있다. 만약, 자식타입에 선언된 필드와 메서드를 꼭 사용해야 할 경우에는
 	강제형변환해서 다시 자식타입으로 변환한 후에 자식타입의 필드와 메서드를 사용할 수가 있다.
 */
public class CastingMain {

	public static void main(String[] args) {
		
		// 1. 자동형변환
//		Child child = new Child();
//		Parent parent = child;
		Parent parent = new Child(); // 한번에 자식->부모 자동형변환
		parent.filed1 = "사용가능";
		//parent.filed2 = "사용불가능"; // 자식 필드엔 접근 불가
		parent.method1();
		parent.method2(); // 사용가능하지만 child의 method2가 호출. 오버라이딩
		//parent.method3(); 사용불가능
				
		System.out.println();
				
		// 2. 강제형변환
		// 1) 형변환가능
		int i = (int)1.0; // 기본 강제형변환 형식
		Child child = (Child)parent; // 클래스의 강제형변환 형식
		child.filed1 = "사용가능";
		System.out.println(child.filed2); // 기존값도 쓸 수 있음
		child.filed2 = "사용가능";  // 수정도 가능
		child.method1(); // Parent
		child.method2(); // Child
		child.method3(); // Child
		
		System.out.println();
		
		
		
		// 2) 형변환불가능  ****
		
		//직접 생성한 부모객체를 자식객체로 형변환하는 것은 실행시 에러가 발생한다.
		//자식객체 -> 부모객체 -> 자식객체의 순서로 형변환하는 것은 가능하지만
		//부모객체 -> 자식객체로 직접형변환하는 경우에는 ClassCastException이 발생한다
		//따라서, 부모객체에서 자식객체로 직접형변환은 불가능하다.
		
		
		Parent parent1 = new Child(); // 자동형변환한 부모타입의 자식객체를
		Child child1 = (Child) parent1;  // 다시 자식으로 강제형변환 가능함.
		Parent parent2 = new Parent();  // 그냥 부모 객체는 불가능함.
		Child child2 = (Child) parent2; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// 문법에러는 아니지만 실행시 예외가 발생한다.
		// java.lang.ClassException
		
		System.out.println("반드시 실행해야할 울트라 짱짱짱인 중요한 로직입니다!!"); // 에러이후는 실행안됨!!!
		
		
	}

}
