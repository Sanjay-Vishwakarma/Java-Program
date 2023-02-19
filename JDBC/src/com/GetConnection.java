package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {

	public static Connection getConnect() {

		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentz", "root", "root");
			System.out.println("connection success...!!!");

		} catch (Exception e) {
			System.out.println("catch---->" + e);
		}
		return con;
		
	}
	

}
