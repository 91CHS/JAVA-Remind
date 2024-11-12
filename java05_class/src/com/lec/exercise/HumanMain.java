package com.lec.exercise;

public class HumanMain {

	public static void main(String[] args) {
		
		Korean minwoo = new Korean();
		American tommy = new American();
		Chinese chingtao = new Chinese();
		
		minwoo.nation = "대한민국";
		
		
		System.out.println();
		minwoo.speak();
		tommy.speak();
		chingtao.speak();
	}

}
