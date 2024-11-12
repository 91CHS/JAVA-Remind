package com.lec.ex11_overloading;

public class RectangleMain {
	
		public static void main(String[] args) {
			//실습. 정사각형의 넓이, 직사각형의 넓이를 구하는 메서드 작성하기
			// areaRectangle(10), areaRectangle(10,20)
			
			Rectangle rtg = new Rectangle();
			
			System.out.println("정사각형의 넓이 =" + rtg.areaRectangle(10));
			System.out.println("직사각형의 넓이 =" + rtg.areaRectangle(10,20));


		}
	
	
}
class Rectangle {

	//오버로딩 => 이름은 같지만 다양
	int areaRectangle (int x) {
		return x*x;
	}
	int areaRectangle (int x,int y) {
		return x*y;
	}


	// 가변인자 ... 을 사용하기 (배열과 향상된 for문)
//	int areaRectangle (int...x) {
//		int mul = 0;
//		for(int i:x) {
//			mul = i*i;  // 이렇게하면 20*20됨.
//		}
//		return mul;
//	}
	

//	   int areaRectangle(int...x) {
//	      int mul=1;
//	      for(int i:x) {
//	         if(x.length==1) {
//	            mul=i;
//	         }
//	         mul=mul*i;
//	      }
//	      return mul;
//	   }


	
	
	
}