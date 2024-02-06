package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {
		// 장미란을 둘리로 주소는 서울 방학동 변경하자.
		// 접속을 위한 클래스들
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0 ;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// update
			String sql = "update customer set name='둘리', address='서울 방학동' where name ='장미란'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if(result>0) {
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
				
			}else {
				System.out.println("수정 실패");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
