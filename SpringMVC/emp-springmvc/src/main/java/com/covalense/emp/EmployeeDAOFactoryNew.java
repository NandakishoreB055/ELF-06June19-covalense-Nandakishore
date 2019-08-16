package com.covalense.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactoryNew {

	@Bean("jdbc")
	public static EmployeeDAO getJDBCInstance() {

		return new EmployeeDAOJDBCImpl();

	}

	@Bean("hibernate")
	public static EmployeeDAO getHibernateInstance() {

		return new EmployeeDAOHibernateImpl();
	}

}