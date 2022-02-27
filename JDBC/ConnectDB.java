package com.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

	public static void main(String[] args) {
		
		String username = "postgres";
		String password = "Christ@2608";
		String url = "jdbc:postgresql://localhost:5432/dummy";

		Connection con = null;// the

		try {

			System.out.println("loading driver connecting....");
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection( url,username, password);
			System.out.println("connected...");

		} catch (Exception e) {
			System.out.println(e);
		}
	

	}

}
