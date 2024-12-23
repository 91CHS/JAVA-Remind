package com.lec.ex01_create;

import java.awt.Toolkit;

public class BeepMain2 {

	public static void main(String[] args) {
		
		// Thread객체를 만드는 방법   (클래스생성법-익명구현객체-람다식 연결됨)
		// 1. 외부에 클래스 생성(BeepTask1.java, Runnable구현객체)
//		Runnable beepTask =new BeepTask1();  // 외부클래스로 객체 만들기
//		Thread thread1 = new Thread(beepTask); // 쓰레드 객체로 만들기
//		thread1.start();    // 쓰레드1 시작!
	
		
		// 2. 익명객체(인터페이스)
//		Thread thread2 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit(); // 스피커지원
//				for(int i=0;i<5;i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					} // 0.5초 , 예외처리
//				}
//			}
//		});
//		thread2.start();
		
		
		// 3. 람다식 : @FuntionalInterface만 람다식 적용할 수 있다.
		Thread thread3 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit(); // 스피커지원
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 0.5초 , 예외처리
			}
		
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// 띵출력을 5번 // 메인쓰레드 소속으로 시작!!
		for(int i=0;i<5;i++) {
			System.out.println("띵~~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
