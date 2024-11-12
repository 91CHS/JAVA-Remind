package com.lec.ex01_create;

import java.awt.Toolkit;

public class BeepMain1 {

	public static void main(String[] args) throws InterruptedException {
		
		// 쓰레드를 쓰지 않았을때!!!!! 띵 소리 5번 후 띵 출력 5번
		
		// 띵소리를 5번
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 스피커지원
		for(int i=0;i<5;i++) {
			toolkit.beep();
			Thread.sleep(500); // 0.5초 , 예외처리
		}
		
		// 띵출력을 5번
		for(int i=0;i<5;i++) {
			System.out.println("띵~~");
			Thread.sleep(500);
		}
	}

}
