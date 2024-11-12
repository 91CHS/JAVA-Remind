package com.lec.ex03_interface;

public class Button {

	private OnClickListner listner; // 필드선언
	XXX xxx;
	
	//메서드
	void click() {
		listner.OnClick();
	}
	
	
	// 중첩인터페이스
	interface OnClickListner{
		 void OnClick();
	}
	
	public void setListner(OnClickListner listner) {
		this.listner = listner;
	}
	
	
}

interface XXX {
	void onClick();
}