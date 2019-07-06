package com.covalense.designpatterns.dao;

import java.util.ArrayList;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();

	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

	boolean createEmployeeInfo(EmployeeInfoBean bean);

	boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);
}
