package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectManyMain {
	
	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PWD = "tiger";	
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			Class.forName(DRV);  // 드라이버로 연결
			Connection conn = DriverManager.getConnection(URL,USR,PWD); // 유저 얻어오기
			PreparedStatement pstmt = conn.prepareStatement("select * from emp where empno>=?");
			pstmt.setInt(1, 7000);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString("ename");
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				String hiredate = rs.getString("hiredate");
				int sal = rs.getInt(6);
				int comm = rs.getInt(7);
				
				System.out.print(empno+"\t");
				System.out.print(ename+"\t");
				System.out.print(job+"\t");
				System.out.print(mgr+"\t");
				System.out.print(hiredate+"\t");
				System.out.print(sal+"\t");
				System.out.println(comm);

			}
		} catch (Exception e) {
						e.printStackTrace();
			System.out.println("DB연결 실패 !!!");
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
