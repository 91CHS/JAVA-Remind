package com.lec.ex04_class;
/*
 	 	3. 동적으로 객체를 생성(newinstance())
 	
 		Class객체를 이용하면 new연산자를 사용하지 않아도 동적으로 객체를 생성할 수 있다.
 		이 방법은 코드 작성시에 클래스의 이름을 결정할 수 없고 런타임시에 클래스이름이
 		결정되는 경우에 매우 유용하게 사용된다.
 		
 		Class객체를 얻은 후에 newinstance()메서드를 호출하면 Object타입의 객체를 얻을 수가
 		있다.
 */
public class NewInstanceMain {

	public static void main(String[] args) throws Exception {
		
		boolean type = true;
		Class _class;
		
		if(type) {
			_class = Class.forName("com.lec.ex04_class.SendAction");
		} else {
			_class = Class.forName("com.lec.ex04_class.ReceiveAction");
		}

		Action action = (Action) _class.newInstance();
		action.execute();
	}

}

interface Action {
	void execute();
}

class SendAction implements Action {

	@Override
	public void execute() {
		System.out.println("문자를 보냅니다!");
	}	
}

class ReceiveAction implements Action {

	@Override
	public void execute() {
		System.out.println("문자를 받습니다!");
	}
	
}