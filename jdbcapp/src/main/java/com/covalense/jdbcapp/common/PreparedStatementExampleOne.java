package com.covalense.jdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lombok.extern.java.Log;

@Log
public class PreparedStatementExampleOne {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		/**
		 * driver = new Driver(); DriverManager.registerDriver(driver);
		 */
		// 1.Second way of loading the "driver".
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2.Get the "DB connection" via "driver"
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);

			// 3.Issue "SQL queries" via "connection"
			String query = "select * from employee_info" + " where id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			rs = pstmt.executeQuery();

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

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// 5.Close all the "JDBC connections"
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
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
