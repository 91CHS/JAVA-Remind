package com.lec.ex04_while;

import javax.swing.JOptionPane;

public class SwingMain {

	public static void main(String[] args) {
		//숫자 맞추기 게임
		// Java에서 swing은 GUI환경으로 인터페이스를 만들어 준다.
		
		String data = JOptionPane.showInputDialog("정답(숫자)을 입력하세요!!");
		System.out.println(data);
		
		//JOptionPane.showConfirmDialog(null, data);
		
		int target = 77;
		int inputData = 0;
		
		inputData = Integer.parseInt(data);
		
		if(inputData == target) {
			System.out.println("축하합니다!!");
			System.out.println("정답입니다");
		} else {
			System.out.println("정답이 아닙니다.");
			System.out.println("다음기회에...");
		}
	}

}
