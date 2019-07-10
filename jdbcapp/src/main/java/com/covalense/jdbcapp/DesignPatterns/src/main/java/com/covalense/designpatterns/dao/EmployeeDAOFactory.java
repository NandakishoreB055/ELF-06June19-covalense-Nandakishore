package com.covalense.designpatterns.dao;

import com.covalense.designpatterns.util.EmployeeDAOImpl2;

public class EmployeeDAOFactory {
	private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOImpl2();
		}
		return dao;
	}
}
