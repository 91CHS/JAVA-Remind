package com.lec.ex06_promotion.method;

public class MethodMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1(); // parent 그대로
		child.method2(); // parent 재정의
		child.method3(); // child에서 추가
		System.out.println();
		
		// 1.자동형변환후에는?
		Parent parent;
		parent = child ; // 형변환
		
		
		// 1) method1은 부모객체의 method1이 호출
		parent.method1();
		
		// 2) method2는 자식객체에서 재정의 되었기 때문에
		// 자식객체의 메서드 즉, child.method2가 호출된다.
		parent.method2();
		
		// 3) method3는 자식객체에서 새롭게 추가된 메서드이기 때문에
		// 부모객체로 타입변환시에 삭제(짤리기)되기 때문에 호출불가
	//	parent.method3();
        System.out.println();
        
        // 2. 형변환이 되었을 경우에 parent와 child가 동일타입인지 여부
        System.out.println(parent == child); // true
        System.out.println(parent.equals(child)); // true
        System.out.println();
        // 참조 주소가 그대로 타입만 다르게 담겼다고 생각하자
        
        Parent p1 = new Parent();
        System.out.println(p1 == child); //false
        System.out.println(p1.equals(child)); //false
        System.out.println();
        
        System.out.println(parent.getClass());
        System.out.println(child.getClass());
        System.out.println(p1.getClass());
	}

}
