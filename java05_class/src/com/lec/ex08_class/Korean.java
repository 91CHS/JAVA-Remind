package com.lec.ex08_class;

public class Korean implements Human {



	@Override
	public void speak(String lang) {
		System.out.println(lang + "로 말을 합니다.");
		
	}

	@Override
	public void move() {
		System.out.println("K팝댄스를 춥니다.");
	}

	@Override
	public void think() {
		System.out.println("생각이 없습니다.");
		
	}

}
