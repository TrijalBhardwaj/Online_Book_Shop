package com.osttra.onlinebookshop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static final String URL = "jdbc:mysql://localhost:3306/online_book_shop";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "trijal";
	
	public static Connection establishConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, USERNAME, PASSWORD); 
	}
	
}