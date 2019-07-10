package com.covalense.designpatterns.dao;

import java.util.ArrayList;
import java.util.List;

import com.covalense.designpatterns.builder.EmployeeData;

public interface EmployeeDAO {
	List<EmployeeData> getAllEmployeeInfo();

	EmployeeData getEmployeeInfo(String id);

	EmployeeData getEmployeeInfo(int id);

	boolean createEmployeeInfo(EmployeeData bean);

	boolean updateEmployeeInfo(EmployeeData bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);
}
