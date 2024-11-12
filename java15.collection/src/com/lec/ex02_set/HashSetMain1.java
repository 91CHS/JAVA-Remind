package com.lec.ex02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain1 {

	public static void main(String[] args) {
		
		// Set컬렉션 만들기
			Set<String> set = new HashSet<>();
			set.add("Java");
			set.add("Database");
			set.add("Python");
			set.add("JDBC");
			set.add("R");
			set.add("Java"); // 중복은 에러를 발생하지 않는다.
			set.add("Java"); // 중복은 에러를 발생하지 않는다.
			set.add("Java"); // 중복은 에러를 발생하지 않는다.
			set.add("Java"); // 중복은 에러를 발생하지 않는다.
			set.add("Java"); // 중복은 에러를 발생하지 않는다.
			set.add("JAVA");
			set.add("SQL");
			System.out.println("총 객체수 = " + set.size());
			System.out.println();
		
		// Set컬렉션 읽기  Iterator에 담고나서 hasNext랑 next로 읽어야함.
			Iterator<String> data = set.iterator();
			while(data.hasNext()) {
				String val = data.next();
				System.out.println(val);
			}
			//data.next();  // NoSuchElementException , Iterator에서 다 꺼내서 없음.
			System.out.println(data.hasNext());  // false
			System.out.println();
			
			data = set.iterator();      // 다시 만들어줘야 나옴.
			System.out.println(data.hasNext());
			System.out.println(data.next());
			System.out.println(data.next());
			System.out.println(data.next());
			System.out.println();
		
		
		// Set컬렉션 삭제
			set.remove("Database");
			data = set.iterator();
			while(data.hasNext()) {
				String val = data.next();
				System.out.println(val);
			}
			System.out.println();
			
		// 전체삭제
			set.clear();
			System.out.println("총 객체수 = " + set.size());
	}

}
