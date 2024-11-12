package com.lec.ex05_exercise.exam;

public class Exercise06 {

	public static void main(String[] args) {
		/*6. Exercise06.java : 
    for문을 이용해서 삼각형을 출력하는 코드를 작성
    1)
    *
    **
    ***
    ****
    *****
		
	
	2)
    *****
    ****
    ***
    **
    *
    
    3)
        *
       **
      ***
     ****
    *****
    
    4) 
    *****
     ****
      ***
       **
        *
    5)	
       *
      ***
     *****
    *******
    
    6)
    *******
     *****
      ***
       *
       
    7)
       *
      ***
     *****
    *******      
     *****
      ***
       * 
         
  */

		System.out.println("1)");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				} System.out.println();
			} 
		
//		System.out.println("2)");
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=6-i;j++) {
//				System.out.print("*");
//				} System.out.println();
//			} 
		
		System.out.println("2)");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
				} System.out.println();
			} 

	
		
		
		System.out.println("3)");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(i<j) {
					System.out.print(" ");
				} else { 
					System.out.print("*");
				}
			} System.out.println();
		}
		
		
		
		System.out.println("4)");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i>j) {
					System.out.print(" ");
				} else { 
					System.out.print("*");
				}
			} System.out.println();
		}

		
		System.out.println("5)");
		
		for(int i=1;i<5;i++) {
			for(int j=1;j+i<=4;j++) {
				System.out.print(" ");
				}
			for(int j=1;j+1<=2*i;j++) {
				System.out.print("*");
			}
						
			System.out.println();
		}
		
		
System.out.println("6)");
		
		for(int i=5;i>0;i--) {
			for(int j=5;j+i<=4;j--) {
				System.out.print(" ");
				}
			for(int j=5;j<=i;j--) {
				System.out.print("*");
			}
						
			System.out.println();
		}
		
		
		
		
		
	}	

}


