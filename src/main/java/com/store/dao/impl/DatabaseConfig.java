package com.store.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfig {

	private static String driver = "com.mysql.jdbc.Driver";
	private static String dbURL = "jdbc:mysql://localhost:3306/world";
	private static String user = "root";
	private static String pass = "root";
	
	
	public static Connection getConnection() throws Exception {
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(dbURL, user, pass);
		return conn;
	}
}
