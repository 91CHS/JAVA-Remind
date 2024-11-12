package com.lec.ex11_method.declare;

public class ComputerMain {

	public static void main(String[] args) {
		
		// 1. 일반매개변수이용 (시그니처에 따라 더 만들어야 함)
		Computer com1 = new Computer();
		int result = com1.add(1,2,3,4,5,6,7,8,9,10);
		System.out.println("1~10까지의 합 =" + result);

		result = com1.add(1, 2, 3, 4, 5);
		System.out.println("1~5까지의 합 = " + result);
		
		
		// 2. 배열이용
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		result = com1.add(arr1);
		System.out.println("1~10까지의 합=" + result);
		
		
		result = com1.add(new int[] {1,2,3,4,5});
		System.out.println("1~5까지 합 = " + result);
		
		
		
		// 3. 유동적인 매개변수 (
		result = com1.add1(12, 3);
		System.out.println("유동적인 매개변수 = " + result	);
		
	}

}

class Computer {

	//10개
	public int add(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r) {
		return i+j+k+l+m+n+o+p+q+r;
	}

	//배열
	public int add(int[] arr1) {
		int sum = 0;
		for(int i:arr1) {
			sum+=i;
		}
		return sum;
	}

	//5개
	public int add(int i, int j, int k, int l, int m) {
		return i+j+k+l+m;
	}

	
	
	// 유동적인 매개변수 정의하기
	int add1(int...x) {
		int sum = 0;
		for(int i:x) {
			sum+=i;
		}
		return sum;
	}
}