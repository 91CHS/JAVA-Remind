package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectManyMain2 {
	
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
			
			String sql = "select * from employees where employee_id>=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 100);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int emp_id = rs.getInt(1);
				String ename1 = rs.getString(2);
				String ename2 = rs.getString(3);
				String email = rs.getString(4);
				String pnumber = rs.getString(5);
				
				System.out.print(emp_id+"\t");
				System.out.print(ename1+"\t");
				System.out.print(ename2+"\t");
				System.out.print(email+"\t");
				System.out.println(pnumber);
			}
					
		} catch (Exception e) {
			System.out.println("DB연결 실패 !!!");
			e.printStackTrace();
		}	finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
			}
		}
		
		
	}

}
