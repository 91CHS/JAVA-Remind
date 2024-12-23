package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneMain2 {

	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "hr";
	final static String PWD = "hr";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			String sql = "select * from employees where first_name=?";
			int row = 0;  // executeUpdate() 메서드 사용시 사용.
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Steven");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int emp_id = rs.getInt(1);
				String ename1 = rs.getString(2);
				String ename2 = rs.getString(3);
				String email = rs.getString(4);
				String pnumber = rs.getString(5);
				System.out.println("사번 = " + emp_id +
								   ", 사원이름 = " + ename1 + ename2 +
								   ", email = " + email +
								   ", 전화번호 = " + pnumber);
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
