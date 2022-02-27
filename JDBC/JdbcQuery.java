package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcQuery {

	public static void main(String[] args) throws Exception {
		String username = "postgres";
		String password = "Christ@2608";
		String url = "jdbc:postgresql://localhost:5432/dummy";
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getInt(3));
		}
       st.close();
       con.close();

	}

}
