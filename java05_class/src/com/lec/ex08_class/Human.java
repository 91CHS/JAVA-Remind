package com.lec.ex08_class;

public interface Human {
	
	// 1.속성자 - 인터페이스에서의 속성(필드)는 상수로 정의해야 한다.
	//String nation; 초기값을 줘야한다
	String NATION = "";
	String name = "";
	String gender = "";
	int age = 0;
	
	// 2. 생성자 - 인터페이스는 생성자가 없다.
	
	// 3. 메서드 - 실행블럭이 없다. 즉, 모든 메서드는 전부 추상메서드
	void speak(String lang);
	void move();
	void think();
	
}
