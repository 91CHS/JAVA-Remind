package com.lec.ex05_exercise.exam;

public class Exercise03 {

	public static void main(String[] args) {
		// 3. Exercise03.java : 
	    // for문을 이용해서 1~100까지의 정수중 3의 배수총합을 구하는 코드
		
		
		int sum = 0;
		
		for (int i=1;i<=100/3;i++) {
			sum += 3*i;
		}
			System.out.println(sum);
	}

}
