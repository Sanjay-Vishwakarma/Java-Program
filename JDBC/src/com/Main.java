package com;

import java.sql.*;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ResultSet rs = null;
		Statement stmt =null;
		GetConnection conn = new GetConnection();

		try {

				stmt=conn.getConnect().createStatement();
				String query ="select * from members";
				rs=stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
