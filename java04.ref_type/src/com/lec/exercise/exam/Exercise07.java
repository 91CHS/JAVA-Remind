package com.lec.exercise.exam;

public class Exercise07 {

	public static void main(String[] args) {

//		7. Exercise08.java : 
//			   주어진 배열의 전체 항목의 합과 평균값을 구하기.(중첩 for문을 이용) 
//			   
			   int[][] array ={
								{95, 86},
								{83, 92, 96},
								{78, 83, 93, 87, 88}
							  };

		 int sum = 0;
		
		for (int[] a : array) {
			for (int b : a) {
				sum += b ;
			}
		}
		System.out.println(sum);


	}

}
