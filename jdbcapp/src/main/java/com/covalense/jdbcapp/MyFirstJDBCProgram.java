package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lombok.extern.java.Log;
import com.mysql.jdbc.Driver;

@Log
public class MyFirstJDBCProgram {

	public static void main(String[] args) {
		Connection con = null;
		Driver driver = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1.First way to Load the "driver"
			/*
			 * driver = new Driver(); DriverManager.registerDriver(driver);
			 */

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
			String query = "select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			// 4."Process the results" returned by "sql queries"
			while (rs.next()) {
				log.info("ID        ==>  " + rs.getInt("ID"));
				log.info("NAME      ==>  " + rs.getString("NAME"));
				log.info("GENDER    ==>  " + rs.getString("GENDER"));
				log.info("SALARY    ==>  " + rs.getInt("SALARY"));
				log.info("PHONE     ==>  " + rs.getInt("PHONE"));
				log.info("JOINING_DATE    ==>  " + rs.getString("JOINING_DATE"));
				log.info("ACCOUNT_NUMBER  ==>  " + rs.getInt("ACCOUNT_NUMBER"));
				log.info("EMAIL    ==>  " + rs.getString("EMAIL"));
				log.info("DESIGNATION    ==>  " + rs.getString("DESIGNATION"));
				log.info("DOB    ==>  " + rs.getString("DOB"));
				log.info("DEPT_ID    ==>  " + rs.getInt("DEPT_ID"));
				log.info("MNGR_ID    ==>  " + rs.getInt("MNGR_ID"));
			}

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
