package com.rays.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstConnec {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(
				"select * , (Physics + Chemistry + Maths) as Total , ((Physics + Chemistry + Maths)/3) as Percentage from marksheet order by Percentage desc limit 0,5");
		
		while (rs.next()) {
			
			System.out.print(rs.getInt(1));
			System.out.print("\t\t\t" + rs.getInt(2));
			System.out.print("\t\t\t" + rs.getString(3));
			System.out.print("\t\t\t" + rs.getString(4));
			System.out.print("\t\t\t" + rs.getInt(5));
			System.out.print("\t\t\t" + rs.getInt(6));
			System.out.print("\t\t\t" + rs.getInt(7));
			System.out.print("\t\t\t" + rs.getInt(8));
			System.out.println("\t\t\t" + rs.getDouble(9));
			
		}

	}

}
