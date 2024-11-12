package com.lec.ex03_for;

public class ForMain {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) { // i는 지역변수
			System.out.print(i+",");
		}
		System.out.println();

//		1~100까지합
		int sum = 0;
		int i = 100; //전역변수
		System.out.println(i);
		for(i=0;i<=10;i++) {
			sum += i;
		}
		System.out.println("1~10의 합 = " + sum);
		System.out.println(i);
	}

}
