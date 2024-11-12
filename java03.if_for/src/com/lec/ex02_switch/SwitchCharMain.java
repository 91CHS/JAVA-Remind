package com.lec.ex02_switch;

public class SwitchCharMain {

	public static void main(String[] args) {
		
		char grade = 'a';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("A학점입니다!");
			break;
		case 'B':
		case 'b':
			System.out.println("B학점입니다!");
		default:
			System.out.println("등급외 입니다");
		}
		
		
		
	}

}
