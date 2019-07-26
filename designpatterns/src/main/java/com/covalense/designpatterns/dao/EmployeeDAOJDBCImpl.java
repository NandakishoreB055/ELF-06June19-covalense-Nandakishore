package com.covalense.designpatterns.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.covalense.designpatterns.builder.EmployeeData;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {
	public ArrayList<EmployeeData> getAllEmployeeInfo() {

		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
		String query = "select * from employee_info";

		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			ArrayList<EmployeeData> beans = new ArrayList<EmployeeData>();
			while (rs.next()) {
				EmployeeData bean = new EmployeeData();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("name"));
				bean.setAge(rs.getInt("age"));
				bean.setSalary(rs.getInt("salary"));
				bean.setPhone(rs.getInt("phone"));
				bean.setJoiningDate(rs.getDate("joining_date"));
				bean.setAccount_number(rs.getInt("account_number"));
				bean.setEmail(rs.getString("email"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDob(rs.getDate("dob"));
				bean.setDept_Id(rs.getInt("dept_id"));
				bean.setMngrId(rs.getInt("mngr_id"));

				beans.add(bean);
			}
			return beans;

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public EmployeeData getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));

		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	public EmployeeData getEmployeeInfo(int id) {
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
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			// 4."Process the results" returned by "sql queries"
			EmployeeData bean = new EmployeeData();
			while (rs.next()) {
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("name"));
				bean.setAge(rs.getInt("age"));
				bean.setSalary(rs.getInt("salary"));
				bean.setPhone(rs.getInt("phone"));
				bean.setJoiningDate(rs.getDate("joining_date"));
				bean.setAccount_number(rs.getInt("account_number"));
				bean.setEmail(rs.getString("email"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDob(rs.getDate("dob"));
				bean.setDept_Id(rs.getInt("dept_id"));
				bean.setMngrId(rs.getInt("mngr_id"));
			}
			return bean;

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} finally {
			// 5.Close all t he "JDBC connections"
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

	@Override
	public boolean createEmployeeInfo(EmployeeData bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeData bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}// End of class
