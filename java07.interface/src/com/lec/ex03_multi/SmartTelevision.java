package com.lec.ex03_multi;
import com.lec.ex02_implements.RemoteControl;

public class SmartTelevision implements Searchable,RemoteControl {
	
	private int volumn;
	@Override
	public void powerOn() {
		System.out.println("Smart TV를 켭니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Smart TV를 끕니다.");
		
	}

	@Override
	public void setVolumn(int volumn) {
		if(volumn > RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		} else if (volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		} this.volumn = volumn;
		System.out.println("현재 스마트TV볼륨은 = " + volumn + "입니다!!");
		
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을(를) 검사합니다");
		
	}
	
}
