package program;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Db {

	public static void main(String args[]) {
		Connection con;
		ResultSet rs;
		Statement stmt;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentz", "root", "root");

			stmt = con.createStatement();
			String query = "SELECT tc.trackingid , tc.accountid, tc.toid,tc.totype ,td.action,td.status,td.currency FROM transaction_common AS tc JOIN transaction_common_details AS td  ON  tc.trackingid=td.trackingid limit 0,30";
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println("This is the transaction id = " + rs.getInt(1) + " and " + rs.getString(2));
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
