package com.bank;

import java.sql.*;

public class Database {

	public Connection getConnect() {

		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details", "root" , "root");
			System.out.println("connection success");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return con;

	}

}
