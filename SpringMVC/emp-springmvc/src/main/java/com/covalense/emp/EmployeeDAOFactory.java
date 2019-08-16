package com.covalense.emp;

public class EmployeeDAOFactory {
	private EmployeeDAOFactory() {
	}

	public static EmployeeDAO getInstance(String dbInteractionType) {

		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
//dao = new EmployeeDAOJDBCmpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl();
		}
		return dao;
	}
}