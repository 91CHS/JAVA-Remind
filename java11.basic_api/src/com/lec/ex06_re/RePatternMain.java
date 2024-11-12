package com.lec.ex06_re;

import java.util.regex.Pattern;

/*
 	정규식과 Pattern클래스(java.util.regex.Pattern)
 	
 	문자열이 정해져 있는 형식(정규식, Regular Expression)으로 구성되어 있는지 여부를
 	검증할 때 사용한다.
 	
 	간단히 말해서 정규식은 문자 or 숫자 등 반복기호가 결합된 문자열이다. 예를 들어서
 	문자열이 02)1234-1234 or 010-9999-2222와 같은 전화번호를 확인할 수가 있는데 정규식은
 	"(02|010)-\d{3,4}-\d{4}"의 형태인지 여부를 boolean으로 리턴, 이메일일 경우에는
 	"hong@gmail.com"일 경우는 정규식은 "\w+@\w+\.\w(\.\w+)?"의 형태로 검증할 수 있다.
 	
 	
 */
public class RePatternMain {

	public static void main(String[] args) {
		// 1. 전화번호 유효성검증하기
		String tel1 = "02-123-1234";
		String tel2 = "02-1234-1234";
		
		// 정규식
		String re = "(02|031|010)-\\d{3,4}-\\d{4}";
		boolean result = Pattern.matches(re, tel1);
		System.out.println("유효한 전화번호 여부 = " + result);
		
		result = Pattern.matches(re, tel2);
		System.out.println("유효한 전화번호 여부 = " + result);
		System.out.println(Pattern.matches(re,"031-1234-1234"));
		System.out.println(Pattern.matches(re,"031-123-1234"));
		System.out.println(Pattern.matches(re,"031-1234-123"));
		
		if(Pattern.matches(re, "031-1234-1234")) {
			System.out.println("정상적인 전화번호 입니다");
		} else {
			System.out.println("비정상적인 전화번호 입니다! 다시 입력하세요!");
		}
		
		
		// 2. 이메일 유효성 검증
		String email = "admin@gmail.com"; // com,co.kr,go.kr,org,or.kr,...
		re = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		if(Pattern.matches(re, email)) {
			System.out.println("정상적인 이메일 주소입니다.");
		} else {
			System.out.println("메일주소가 아닙니다. 재입력하세요");
		}
		if(Pattern.matches(re, "admingmail.com")) {
			System.out.println("정상적인 이메일 주소입니다.");
		} else {
			System.out.println("메일주소가 아닙니다. 재입력하세요");
		}
		
		// 3. 숫자 or 문자 검증
		System.out.println(Pattern.matches("[a-z]",	 "a")); // []한개의 문자, true
		System.out.println(Pattern.matches("[a-f]",	 "z")); // false
		System.out.println(Pattern.matches("[a-z]",	 "az")); // false
		System.out.println(Pattern.matches("[a-z]+","az")); // []+ 단어단위, true
		System.out.println(Pattern.matches("[A-Z]",	 "a")); // 대소문자구분,false
		System.out.println(Pattern.matches("[A-Z]+","ASBGTE")); // true
		System.out.println();
		
		System.out.println(Pattern.matches("[0-9]", "8"));
		System.out.println(Pattern.matches("[0-9]+", "8245"));
		System.out.println();
		
		//회원가입 userid897xxx$#
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "userid897xxx")); // true
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "userid897xxx#")); // false
		System.out.println();
		
		System.out.println(Pattern.matches("[^a-zA-Z0-9]+", "userid897xxx")); // ^not false
		System.out.println(Pattern.matches("[^a-zA-Z0-9]+", "@#%@$%$#")); // true
		
		
		
		
		
		
		
		
		
		
	}

}
