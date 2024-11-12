package com.lec.ex09_member;
/*
 	클래스 멤버
 	
 	1.  필드(Field,속성,클래스변수) 
 		
 		객체의 고유속성을 저장하는 곳이다.
 		선언방법은 변수와 유사하지만 필드를 변수라 하지 않는다.
 		변수는 생성자와 메서드내에서만 사용되고
 		생성자와 메서드의 실행이 종료가 되면 자동으로 소멸이 되지만
 		필드는 생성자와 메서드 전체에서 사용(전역변수개념)되고
 		객체가 소멸되지 않는 한 객체와 함께 메모리에 존재한다.
 		즉, 객체가 소멸되기 전까지 메모리(힙)에 존재하고 객체가 소멸될 때 같이 소멸된다.
 		
 	2. 메서드(Method,기능,객체의 동작역할)
 	
 		메서드는 객체의 동작(기능,행위)에 해당하는 실행 블럭이다. 이 블럭은 이름을 부여하고
 		이 이름으로 메서드를 호출하게 되면 블럭안에 정의된 실행문들이 일괄적으로 실행이 되고
 		그 결과를 호출한 곳으로 리턴하는 역할을 한다.
 	
 	
 	3. 생성자(Constructor,객체초기화)
 	
 		생성자는 new 객체생성연산자로 호출되는 특별한 블럭이다. 생성자의 역할은 객체를 생성할 때
 		객체의 초기화를 담당한다. 즉, 필드를 초기화하거나 메서드를 호출해서 객체를 생성할 수 있도록 한다.
 		
 		1) 기본생성자(default Constructor)
 		
 		모든 클래스는 생성자가 반드시 존재해야 하며 한 개이상의 생성자를 가질 수 있다.
 		단, 복수의 생성자를 정의할 경우에는 매개변수의 갯수, 데이터타입 및 순서가 달라야 한다.
 		즉, 동일한 형태의 시그니쳐를 갖는(중복되는) 생성자는 정의할 수 없다.
 		
 		기본 생성자는 별도로 정의하지 않아도 자바컴파일러(javac.exe)가 컴파일시에 자동으로 추가한다.
 		하지만, 개발자가 기본생성자이외의 생성자를 정의할 경우에는 자동으로 추가되지 않는다.
 		따라서 기본생성자이외의 다를 생성자를 정의하고 기본생성자가 필요한 경우에는 반드시 명시적으로
 		기본생성자를 정의해야 한다.
 		
 		클래스가 public접근제한자로 선언이 되어 있으면 기본생성자도 자동으로 public으로 선언되지만
 		클래스가 public으로 선언되지 않을 경우에는 기본생성자도 public으로 선언되지 않는다.
 		
 		
 */


public class Car {
	//1.필드(속성)
	String company = "Tesla";
	String model;
	String color;
	int maxSpeed = 300;
	int speed;
	
	//2.생성자

	Car() {System.out.println("1.기본생성자가 호출되었습니다.");}
	Car(String model) {
		this.model = model;
		System.out.println("2.문자열(" + model + ")생성자가 호출되었습니다!");
	}
	Car(int speed) {
		this.speed = speed;
		System.out.println("3.숫자형(" + speed + ")생성자가 호출되었습니다!");
	}
	Car(String model,int speed) {
		this.model=model;
		this.speed=speed;
		System.out.println(this.model+","+this.speed+"형태의 생성자가 호출되었습니다!");
	}
	Car(int speed , String model) {
		this.model=model;
		this.speed=speed;
		System.out.println(this.speed+","+this.model+"형태의 생성자가 호출되었습니다!");
	}


	public Car(String model, String color, int maxSpeed, int speed) {
		//super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		System.out.println(this.toString());
		System.out.println(super.toString());
	}


	
	//3.메서드
	void poweron() {System.out.println("자동차의 시동을 겁니다");}
	void run() {System.out.println("운행중..");}
	void stop() {System.out.println("정지!!");}
	void poweroff() {System.out.println("시동을 끕니다.");}

	
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
