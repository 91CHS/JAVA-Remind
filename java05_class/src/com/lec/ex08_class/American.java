package com.lec.ex08_class;

public class American implements Human {

	@Override
	public void speak(String lang) {
		System.out.println(lang + "로 의사소통합니다");
	}

	@Override
	public void move() {
		System.out.println("감자튀김을 먹습니다.");
	}

	@Override
	public void think() {
		System.out.println("무슨생각을 하는지 모르겠습니다.");
	}

}
