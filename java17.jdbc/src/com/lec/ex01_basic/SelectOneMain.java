package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneMain {
	
	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PWD = "tiger";	
	
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			String sql = "select * from emp where empno=? and job=?";
			int row = 0;
			
			// emp테이블에서 한개의 row읽기
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 7369);
			pstmt.setString(2, "CLERK");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String hiredate = rs.getString("hiredate");
				System.out.println("사원번호=" + empno + ", 사원이름=" + ename + ", 입사일자=" + hiredate);
			} else {
				System.out.println("자료를 찾지 못했습니다!");
			}
		} catch (Exception e) {
			System.out.println("DB연결실패!!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
			}
		}
	
	
	}
}












