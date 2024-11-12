package com.lec.ex02_name;

public class ThreadB extends Thread {
		
	public ThreadB() {}  // 이름부여하지 않으면 ThreadA처럼 자기 이름
	
	 @Override
	public void run() {
	  for(int i=0;i<10;i++) {
		  System.out.println(getName() + "가 출력한 내용");
	  }
	}
}
