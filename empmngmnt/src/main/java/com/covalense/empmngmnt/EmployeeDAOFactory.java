package com.covalense.empmngmnt;

public class EmployeeDAOFactory {
	private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOHibernateImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl();
		}
		return dao;
	}
}
