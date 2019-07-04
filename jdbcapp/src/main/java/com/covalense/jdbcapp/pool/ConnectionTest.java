package com.covalense.jdbcapp.pool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lombok.extern.java.Log;

@Log
public class ConnectionTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ConnectionPool pool = null;
		try {
			pool = ConnectionPool.getConnectionPool();
			con = pool.getConnectionFromPool();

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

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5.Close all the "JDBC connections"
			try {
				pool.returnConnectionToPool(con);
				/*
				 * if (con != null) { con.close(); }
				 */
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
