package com.lec.ex05_string.basic;

public class StringMethodMain1 {

	public static void main(String[] args) {
		// 1. replace  // Immutable 불변. String은 불변해서 값은 수정하면 새로 생성된다!!
		String oldstr = "자바 프로그래밍";
		String newstr = oldstr.replace("자바", "Java");
		System.out.println(newstr);
		System.out.println(oldstr.hashCode() + " : " + newstr.hashCode());
		System.out.println(oldstr.toString() + " : " + newstr);
		oldstr = oldstr.replace("자바","python");
		System.out.println(oldstr + " : " + oldstr.hashCode());
		System.out.println();
		
		// 2. substring
		//   1) substring(int from, int to) : from~to-1까지의 문자를 추출
		//   2) substring(int from)         : from~문자
		String ssn = "910430-1234567";
		String birthday = ssn.substring(0,6); // 인덱스 0에서 6전까지 자르기
		String sno = ssn.substring(7); // 인덱스 7~끝까지
		String gender = ssn.substring(7,8);  // 인덱스 자르기. 인덱스7에서 8전까지. = 인덱스 7만
		System.out.println("생년월일=" + birthday + ", 주민번호 = " + sno + ", " + (gender.equals("1") ? "남자" : "여자"));
		System.out.println();
		
		// 3. toLowerCase, toUpperCase
		String str1 = "java programming";
		String str2 = "JAVA PROGRAMMING";
		System.out.println(str1.toUpperCase() + " : " + str1);
		str1 = str1.toUpperCase();
		System.out.println(str1);
		System.out.println(str2.toLowerCase() + " : " + str2);
		System.out.println();
		
		// 대소문자의 동등비교 equalsIgnoreCase
		str1 = "java programming";
		str2 = "JAVA PROGRAMMING";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println();
		
		
		// 4. trim : 앞뒤의 공백을 제거
		String tel1 = "     02";
		String tel2 = "1234   ";
		String tel3 = "  02 1234   ";
		System.out.println(tel1.trim() + ", " + tel2.trim() + ", " + tel3.trim());
		System.out.println(tel1);
		System.out.println();
		
		// 5. valueOf : int, double등의 기본타입을 문자열로 변환하는 메서드
		String val1 = String.valueOf(false);
		String val2 = String.valueOf(10);
		String val3 = String.valueOf(3.14);
		System.out.println(val1);
		System.out.println(val2 + val3);
		
	}
}
