package com.lec.ex03_class;

public class HumanMain {

	public static void main(String[] args) {
		
		Human American = new Human("Steve");
		Human Korean = new Human("최한솔");
		
		System.out.println(American.name);
		System.out.println(Korean.name);
		System.out.println();
		
		American.speak();
		Korean.speak();
		System.out.println();
		
		American.speak("English");
		Korean.speak("한글");
		System.out.println();
		
		American.speak("English",28);
		Korean.speak("한글",27);
		System.out.println();
		
		
		System.out.println(American.speak(24,"English"));
		System.out.println(Korean.speak(20,"한글"));
		System.out.println();
		
		String result = Korean.speak(31, "English");
		System.out.println(result);
	}

}
