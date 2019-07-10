package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lombok.extern.java.Log;

@Log
public class JDBCProgramForAWSDB {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://mysqlawscovalense.cqufto3vbqv3.ap-south-1.rds.amazonaws.com:3306/mysqlawscovalense?user=root&password=puppy007";
		String query = "select * from employee_info";

		try (Connection con = DriverManager.getConnection(dbUrl);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
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
		}
	}
}
