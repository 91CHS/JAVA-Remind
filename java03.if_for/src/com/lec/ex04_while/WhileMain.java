package com.lec.ex04_while;

public class WhileMain {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=10) {
			System.out.println(i+ ",");
			i++;
		}
		
		// 1~10까지합
		int sum = 0;
		i = 1;
		while(i<=10) {
			sum += i++;
		}
		System.out.println("1~10까지 합 = " + sum);

		// 1~20까지합
		int sum2 = 0;
		i = 1;

		while(i<=5){
			sum2 += i++;
		}
		System.out.println("1~5까지 합 = " + sum2);
		
	}
}
