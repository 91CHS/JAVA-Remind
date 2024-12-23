package com.lec.ex05_string.basic;

import java.io.UnsupportedEncodingException;

public class StringMethodMain2 {

	public static void main(String[] args) {
		
		// 6. charAt() : 한개의 문자 가져오기
		String ssn = "910430-1234567";
		char gender = ssn.charAt(7);  // 인덱스니까 7+1번째 자리
		System.out.println(gender=='1' ? "남자" : "여자");
		
		// 7. getBytes()
		//   1) getBytes()
		String str = "안녕하세요"; // uft-8 한글=3bytes, euc-kr 한글=2bytes
		byte[] byte1 = str.getBytes();
		System.out.println(byte1.length + "bytes");  // uft8한글 1자는 3바이트이므로 length는 15가 된다.
		System.out.println(byte1); // toString()과 같다. 오버라이드하지 않은 기본 Object의 toString은 해시코드를 반환한다. [는 배열 B는 byte @뒤는 배열객체를 16진수로 나타냄.
		
		String str1 = new String(byte1);
		System.out.println("byte array(utf-8) -> string으로 변환 = " + str1);  // 안녕하세요
		
		//   2) getBytes(문자셋)
//		byte[] bute2 = str.getBytes("EUC-KR");
		try {
			byte[] byte2 = str.getBytes("EUC-KR"); // 인코딩: 사람이 읽을 수 있는 텍스트(문자열)를 컴퓨터가 처리할 수 있는 **바이트(byte)**로 변환하는 과정
			System.out.println(byte2.length + " bytes"); // euc-kr에서 한글 1자는 2바이트라서 10
			String str2 = new String(byte2,"EUC-KR"); // 다시 디코딩 하는건 생성자 사용하면 된다.
			System.out.println("byte array(EUC-KR) -> string으로 변환 = " + str2);
			
			byte[] byte3 = str.getBytes("utf-8");
			System.out.println(byte3.length + " bytes");
			String str3 = new String(byte3); // 현재 기본 문자셋을 utf-8로 했기에 그냥 디코딩해도 됨.
			System.out.println("byte array(utf-8) -> string으로 변환 = " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		// 8. indexOf()
		// 매개값으로 주어진 문자열이 시작되는 위치(인덱스)를 정수로 리턴하는 메서드
		// 만약, 주어진 문자열을 찾지 못했을 경우 -1을 리턴
		String 제목 = "2022.12.01 현재 코로나 확산세 심각";
		int loc = 제목.indexOf("코로나");
		System.out.println(loc); // 15번째니까 14리턴
		
		if(제목.indexOf("코로나") >= 0) {            // 이런식으로 많이 사용된다!!!!!!!!!!
			System.out.println("코로나 기사 검색 성공");
		} else {System.out.println("코로나 기사 검색 실패");
			}
	}

}
