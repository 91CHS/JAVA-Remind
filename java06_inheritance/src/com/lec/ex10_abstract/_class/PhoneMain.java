package com.lec.ex10_abstract._class;
/*
 	추상클래스
 	
 	1. 추상클래스의 개념
 	
 		추상클래스의 의미는 클래스들의 공통된 속성, 기능등의 특성들만 선언(추출)한 것이다.
 		예를들어 새,곤충,물고기등의 실체에서 공통된 특성을 추출해 보면 동물이라는 공통점이 있다.
 		이와 같이 구체적인 실체라기 보다는 동물들이 공통된 특성들을 모아서 추상적인 형태로 정의한
 		것이라 볼 수 있다.
 		
 		클래스에서도 추상클래스를 정의해서 자식클래스들이 상속하는 공통된 속성들을 선언할 수가 있다.
 		추상클래스와 실체클래스는 상속관계를 가지고 있다. 추상클래스가 부모클래스이고 실체클래스가
 		자식클래스로 구현하여 실체클래스는 부모인 추상클래스에 정의된 모든 특성들을 상속할 뿐만 아니라
 		자식클래스에 새로운 특성들을 추가할 수가 있다.
 		
 		추상클래스는 실체클래스의 공통된 속성(필드와 메서드)들을 모아서 만들었기 때문에
 		추상클래스로 직접 객체를 생성할 수 없다. 즉, 추상클래스는 new 객체생성연산자를 사용할 수가 없다.
 	
 	2. 추상클래스이 용도
 	
 		1) 실체클래스의 공통된 필드와 메서드를 통일해서 관리할 목적
 		2) 실체클래스들의 작성할 때 시간을 절약
 	
 	3. 추상클래스의 선언
 	
 		추상클래스를 선언할 때는 클래스 선언부에 "abstract"로 선언해야 한다. abstract로 선언하게 되면
 		new 연산자로 객체를 생성할 수 없고 상속을 통해서 자식클래스로만 객체를 생성할 수가 있다.
 		
 		
 	4. 추상메서드와 오버라이드
 	
 		추상클래스는 실체클래스가 공통적으로 가져야할 필드와 메서드를 정리해 놓은 추상 클래스이므로
 		실체 클래스의 특성(필드,메서드)를 통일화, 공통사용에 그 목적이 있다.
 		
 		모든 실체들이 가지고 있는 메서드의 실행내용이 동일하다면 추상클래스에 메서드를 작성하는 것이
 		좋을 것이지만 메서드의 선언만하고 실체 실행될 내용들은 실체클래스마다 달라야 하는 경우가 많다.
 		
 		예를 들어 Animal이라는 추상클래스에서 sound()라는 메서드를 정의한 후에 Car,Dog,Bird 같은
 		Animal 추상클래스를 상속받은 실체클래스에서 각각 실체의 특성에 맞게 메서드를 작성하고
 		sound()라는 메서드는 실체클래스에서 반드시 구현되도록 강제화하기 위해 추상메서드를 선언하고
 		그 추상메서드를 상속받는 실체클래스에서 실제로 실행할 메서드로 구현(Override)하도록 한다.
 	
 	
 	
 	
 */

public class PhoneMain {

	public static void main(String[] args) {
		
		// 추상클래스는 객체를 생성할 수 없다.
		//Phone phone = new Phone("홍길동");
		
		SmartPhone phone = new SmartPhone("홍길동");
		System.out.println(phone.owner);
		phone.powerOn();
		phone.internetSearch("www.google.com");
		phone.powerOff();
		
	}

}
