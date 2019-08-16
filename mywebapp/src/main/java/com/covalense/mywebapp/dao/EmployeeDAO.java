package com.covalense.mywebapp.dao;

import java.util.List;

public interface EmployeeDAO {
	List<EmployeeData> getAllEmployeeInfo();

	EmployeeData getEmployeeInfo(String id);

	EmployeeData getEmployeeInfo(int id);

	boolean createEmployeeInfo(EmployeeData bean);

	boolean updateEmployeeInfo(EmployeeData bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);
}
