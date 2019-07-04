package com.covalense.jdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lombok.extern.java.Log;

@Log
public class StatementExampleTwo {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			
			// 1.Second way of loading the "driver".
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}

			// 2.Get the "DB connection" via "driver"
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);

			log.info("connection impl class==>" + con.getClass());

			// 3.Issue "SQL queries" via "connection"
			String query = "insert into employee_info values"
					+ "(10,'kkk',22,'male',20000,58372857,'2019-09-08',"
					+ "4755585,'kkk@gmail.com','developer','1997-09-08',1,204)";
			stmt = con.createStatement();
			int rt = stmt.executeUpdate(query);

			// 4."Process the results" returned by "sql queries"
		log.info("updated is "+rt);
				
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5.Close all the "JDBC connections"
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
