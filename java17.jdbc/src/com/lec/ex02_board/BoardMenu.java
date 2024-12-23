package com.lec.ex02_board;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BoardMenu {
	
	private double ver;

	public BoardMenu(double ver) {
		this.ver = ver;
	}
	
	public void mainBoardMenu() {
		
		 BoardDAOImpl dao = BoardFactory.getInstance();		 
		 
		while(true) {
			int menuNo = mainMenuUI();
			
			switch(menuNo) {
			case 0: System.out.println("프로그램종료!!"); System.exit(0); break;
			case 1: makeBoard(dao); break;  // dao.creatBoard();
			case 2: listBoard(dao); break; 
			case 3: contentView(dao); break;
			case 4: updateBoard(dao); break;
			// 실습
			// delete는 글번호입력
			// findBySubject는 제목을 입력 , where like 조건 추가, 글번호 desc
			// findByWriter는 작성자 입력 , where like 조건 추가, 글번호 desc
			case 5: deleteBoard(dao); break;
			case 6: findBySubject(dao); break;
			case 7: findByWriter(dao);
			
			}
		}
	}
	
	public int mainMenuUI() {	
		String menuNo = JOptionPane.showInputDialog(
				"==== 게시판관리프로그램 V" + this.ver + " ====\n\n"+
						"1. 새로운 글쓰기 \n" +
						"2. 전체글 목록조회 \n" +
						"3. 본문글 보기 \n" +
						"4. 본문글 수정 \n" +
						"5. 본물글 삭제 \n" +
						"6. 제목으로 게시글 조회 \n" +
						"7. 작성자로 게시글 조회 \n" +
						"0. 종료 \n\n" +
				"처리할 작업번호를 입력하세요!!");
		
		if ((menuNo == null) || (menuNo.equals(""))) {
			return 0;
		} else {
			return Integer.parseInt(menuNo);
		}
	}
	
	public void makeBoard(BoardDAOImpl dao) {
		dao.creatBoard();
	}
	
	public void findByWriter(BoardDAOImpl dao) {
		String wirter = JOptionPane.showInputDialog("찾을 작성자를 입력하세요");
		
		ArrayList<BoardVO> boardList= dao.findByWriterBoard(wirter);
		
		System.out.println("=====================================");
		System.out.println("글제목\t\t제목\t\t작성자\t\t내용");
		System.out.println("=====================================");
		
		for(BoardVO bd:boardList) {
			System.out.println(bd.toString());
		}
		System.out.println("----- 출력종료 -----\n\n");
	}
		
	

	public void findBySubject(BoardDAOImpl dao) {
		
//		String subject = JOptionPane.showInputDialog("찾을 제목을 입력하세요");
//		
//		if ((subject == null) || (subject.equals(""))) {
//			return;
//		} else {
//			dao.findBySubjecttBoard(subject);
//		}
//	}
		String subject = JOptionPane.showInputDialog("찾을 제목을 입력하세요");
		
		ArrayList<BoardVO> boardList= dao.findBySubjecttBoard(subject);
		
		System.out.println("=====================================");
		System.out.println("글제목\t\t제목\t\t작성자\t\t내용");
		System.out.println("=====================================");
		
		for(BoardVO bd:boardList) {
			System.out.println(bd.toString());
		}
		System.out.println("----- 출력종료 -----\n\n");
	}
		
	

	public void deleteBoard(BoardDAOImpl dao) {
		
		String bno = JOptionPane.showInputDialog("삭제할 글번호를 입력하세요");
		
		if ((bno == null) || (bno.equals(""))) {
			return;
		} else {
			dao.deleteBoard(Integer.parseInt(bno));
		}
	}

	
	public void updateBoard(BoardDAOImpl dao) {
		
		String bno = JOptionPane.showInputDialog("수정할 글번호를 입력하세요");
		
		if ((bno == null) || (bno.equals(""))) {
			return;
		} else {
			dao.updateBoard(Integer.parseInt(bno));
		}
	}

	public void contentView(BoardDAOImpl dao) {
		
		String bno = JOptionPane.showInputDialog("조회할 글번호를 입력하세요");
		
		if ((bno == null) || (bno.equals(""))) {
			return;
		} else {
			BoardVO bd = dao.viewBoard(Integer.parseInt(bno));
			System.out.println("글제목 : "+ bd.getSubject());
			System.out.println("작성자 : "+ bd.getWriter());
			System.out.println("글내용 : "+ bd.getContent() + "\n\n");
		}
		
	}

	public void listBoard(BoardDAOImpl dao) {
		
		ArrayList<BoardVO> boardList= dao.listBoard();
		
		System.out.println("=====================================");
		System.out.println("글제목\t\t제목\t\t작성자\t\t내용");
		System.out.println("=====================================");
		
		for(BoardVO bd:boardList) {
			System.out.println(bd.toString());
		}
		System.out.println("----- 출력종료 -----\n\n");
	}

	
	


}
