package com.lec.ex02_name;

// ex01에선 Runnable 상속으로 쓰레드를 만들었지만 이번엔 Thread를 상속받아서 만드는 법
public class ThreadA extends Thread {

		 public ThreadA() {
			 setName("ThreadA");
		 }
		 
		 @Override
		public void run() {
		  for(int i=0;i<10;i++) {
			  System.out.println(getName() + "가 출력한 내용");
		  }
		}
		 
		 
		 
		 
}