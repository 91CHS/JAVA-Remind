package com.lec.ex01_nongeneric;

public class BoxMain {

	public static void main(String[] args) {
		
		Box 과일상자 = new Box();
		
		과일상자.setObject(new Apple()); // Apple -> Object로 자동형변환
		Apple 사과 = (Apple)과일상자.getObject(); // 강제형변환이 필수
		System.out.println(사과);
		System.out.println(사과.getClass());
		
			
		Box 도구상자 = new Box();
		도구상자.setObject(new Hammer()); // Apple -> Object로 자동형변환
		Hammer 망치 = (Hammer)도구상자.getObject();  // 강제형변환이 필수
		System.out.println(망치);
		System.out.println(망치.getClass());
		
		
//		과일상자.setObject(new Hammer());
//		Apple 사과2 = (Apple) 과일상자.getObject();
//		
		
//		
//		도구상자.setObject(new Apple());
//		Hammer 망치2 = (Hammer)도구상자.getObject();  
//		
		// 개나소나
		과일상자.setObject(new String("소향"));
		과일상자.setObject(1);
		과일상자.setObject(1.0);
		과일상자.setObject('A');
		도구상자.setObject(new int[] {});
		
		
	}

}

class Box {
	
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
		
}

class Apple{
	@Override
	public String toString() {
		return "나는 사과입니다!";
	}
}
class Hammer{
	@Override
	public String toString() {
		return "나는 망치입니다.";
	}
}