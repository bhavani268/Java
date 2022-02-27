package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UpdateDB {

	public static void main(String[] args) throws Exception {
		String username = "postgres";
		String password = "Christ@2608";
		String url = "jdbc:postgresql://localhost:5432/dummy";
		
		int empid=4;
		String ename="chivani";
		int salary=30000;
		String q="insert into emp values(?,?,?)";
		
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement st=con.prepareStatement(q);
		
		st.setInt(1,empid);
		st.setString(2,ename);
		st.setInt(3, salary);
		int count=st.executeUpdate();
		System.out.println(count + "rows effected");
		
		st.close();
		con.close();

	}

}
