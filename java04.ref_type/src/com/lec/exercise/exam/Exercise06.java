package com.lec.exercise.exam;

public class Exercise06 {
	public static void main(String[] args) {
		
//		6. Exercise07.java : 
//			   주어진 배열의 항목에서 최대값을 구하기.(for문을 이용)
//			   
//			   int[] array={1,5,3,8,2};
		int[] array={1,5,3,8,2};
		
		int max = 0;

		for (int m : array){
			if (max<m) {
				max = m;
			}
		}

		System.out.println(max);
		
		
	}
}
