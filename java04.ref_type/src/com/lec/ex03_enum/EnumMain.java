package com.lec.ex03_enum;

import java.util.Calendar;

public class EnumMain {

	public static void main(String[] args) {
		
		String str = new String("소향");
		//Week today = new Week();
		
		
		//enum은 객체화/인스턴스화 할 수 없다.
		//Week열거타입을 선언했다면 열거타입을 호출해서 사용할 수 있다.
		//열거타입은 하나의 데이터타입(참조타입,사용자가 정의한 새로운 데이터타입)
		//이므로 변수로 선언하고 사용해야 한다.
		//열거타입변수를 선언했다면 열거상수를 저장하거나 사용할 수 있다.
		//열거상수는 단독으로 사용할 수 없고
		//"열거타입.열거상수"형태로 사용해야 한다.
		//즉 Week.MONDAY 형태로 써야한다.
		
		
		int i1 = 0;
		Week today = null;
		
		//현재의 요일을 확인하기
		// Calendar라는 클래스를 이용하여 날짜를 제어할 수 있다.
		// Calendar는 new연산자로 객체를 생성할 수 없고 getInstance()라는
		// 메서드로 객체화(인스턴스화)시켜야 한다.
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 현재요일을 말한다.
		System.out.println(week); // 1 = Sunday,...,7 = Saturday
		
		
		switch(week) {
		case 1: today = Week.SUNDAY;break;
		case 2: today = Week.MONDAY;break;
		case 3: today = Week.THUSDAY;break;
		case 4: today = Week.WENDSDAY;break;
		case 5: today = Week.THURsDAY;break;
		case 6: today = Week.FRIDAY;break;
		case 7: today = Week.SATURDAY;break;
		}
		System.out.println("오늘의 요일은" + today + "입니다");
		
		//예를 들어 주민번호 읽기
		
		int gender = 1;
		if(gender==1 || gender==3) {
			System.out.println("사원의 성별은" + Gender.남자 + "입니다");
		} else {
			System.out.println("사원의 성별은" + Gender.여자 + "입니다");
		}
		
		
	}

}
