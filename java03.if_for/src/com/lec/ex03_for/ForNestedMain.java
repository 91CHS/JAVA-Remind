package com.lec.ex03_for;

public class ForNestedMain {

	public static void main(String[] args) {
		
		//구구단
		for(int dan=2;dan<=9;dan++) {
			System.out.println("---<" + dan + "단 >---");
			for(int i=1;i<=9;i++) {
				System.out.println(dan + " x " + i + " = " + (dan*i));
			}
			System.out.println();
		}
		
		//실습.구구단
		// 2 x 1 = 2 ... 9 x 1 = 9 
		// ...
		// 2 x 9 = 18 ... 9 x 9 = 81
		
		for (int i=1;i<=9;i++) {
			
						
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan + " x " + i + " = " + (i*dan) + " \t ");
				}
			System.out.println();
		}
		
		
		
		
	
	}
	
}
			
		
		
		
		

	


