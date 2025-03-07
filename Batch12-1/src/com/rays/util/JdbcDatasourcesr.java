package com.rays.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDatasourcesr {

	private static JdbcDatasourcesr jds = null;
	private ComboPooledDataSource ds = null;

	private  JdbcDatasourcesr() {
		
		try {
			ds = new ComboPooledDataSource();
			
			ds.setDriverClass("com.mysql.cj.jdbc.Driver");
			ds.setJdbcUrl("jdbc:mysql://localhost:3306/advancejava");
			ds.setUser("root");
			ds.setPassword("root");
			ds.setInitialPoolSize(5);
			ds.setAcquireIncrement(5);
			ds.setMaxPoolSize(50);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	public static JdbcDatasourcesr getInstance() {
		if (jds == null) {
			jds = new JdbcDatasourcesr();
		}
		return jds;
	}

	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
		} catch (Exception e) {
			return null;
		}
	}

	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {

		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void closeConnection(Connection conn, Statement stmt) {
		closeConnection(conn, stmt, null);
	}

	public static void closeConnection(Connection conn) {
		closeConnection(conn, null, null);
	}

}
