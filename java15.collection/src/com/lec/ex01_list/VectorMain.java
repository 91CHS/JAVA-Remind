package com.lec.ex01_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/* 
   벡터의 차이를 보려면 쓰레드를 만들어야 되는데
   강사님이 따로 하진 않으셨다.
*/
public class VectorMain {

	public static void main(String[] args) {
		
		// 1. ArrayList - Member
		List<Member> members = new ArrayList<>();
		// insert into member values();
		members.add(new Member(1, "홍길동", "12345", "hong1@gmail.com"));
		members.add(new Member(2, "홍길순", "12345", "hong2@gmail.com"));
		members.add(new Member(3, "홍길자", "12345", "hong3@gmail.com"));
		members.add(new Member(4, "홍길녀", "12345", "hong4@gmail.com"));
		members.add(new Member(5, "홍길상", "12345", "hong5@gmail.com"));
		for(Member member:members) {
			System.out.println(member.toString());
		}
		System.out.println();
		
		
		// 실습. board를 5건 추가 , 2번째 삭제, 출력
		// 2. Vector - Board
		List<Board> boards = new Vector<>();
		// insert into board values();
		// select * from member , board member.id = board.writer
		boards.add(new Board(1,"영향", "최한솔", "12345"));
		boards.add(new Board(2,"경청", "최성형", "23456"));
		boards.add(new Board(3,"배려", "조효상", "34567"));
		boards.add(new Board(4,"마음", "김동언", "45678"));
		boards.add(new Board(5,"소통", "백선생", "56789"));
		
		// delete * from board where board.bno = 2;
		boards.remove(1);
		
		// select * from board where 1 and 10;
		// html에 table태그에 출력하는 방법?
//		for (Board board:boards) {
//			System.out.println(board.toString());
//		} 
//		System.out.println();
		for (int i=0;i<boards.size();i++) {
			Board board = boards.get(i);
			System.out.println(board.toString());
		}
		System.out.println();
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Member {

	int id;
	String pw;
	String name;
	String email;
	public Member(int id, String pw, String name, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}	
}

class Board {
	
	int bno;
	String title;
	String writer;
	String content;
	public Board(int bno, String title, String writer, String content) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", writher=" + writer + ", content=" + content + "]";
	}
	
}