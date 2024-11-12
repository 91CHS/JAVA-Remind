package com.lec.ex01_object.ex03_tostring;

import java.util.Date;


public class SmartTelvisionMain {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		
		Date date = new Date(3829);
		System.out.println(date.toString());
		
		String str = new String("홍길동");
		System.out.println(str.toString());
		
		SmartTelvision tv = new SmartTelvision("LG", "스마트TV");
		System.out.println(tv.toString());
	}

}
