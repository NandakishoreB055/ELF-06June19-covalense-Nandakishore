package com.covalense.designpatterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.covalense.designpatterns.builder.EmployeeData;
import com.covalense.designpatterns.dao.EmployeeDAO;
import com.covalense.designpatterns.dao.EmployeeDAOFactory;
import com.covalense.designpatterns.dao.EmployeeDAOHibernateImpl;
import com.covalense.designpatterns.dao.EmployeeDAOJDBCImpl;

import lombok.extern.java.Log;

@Log
public class DesignPatternsTest {
	public static void main(String[] args) throws ParseException {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeData empInf = new EmployeeData();
		/*
		 * printData(dao.getEmployeeInfo(101)); printData(dao.getEmployeeInfo("102"));
		 * ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfo(); for
		 * (EmployeeInfoBean bean : beans) { printData(bean); }
		 */

		// EmployeeDAO dao = new EmployeeDAOHibernateImpl();

		/*
		 * printData(dao.getEmployeeInfo(101)); printData(dao.getEmployeeInfo("102"));
		 */

		// Create an Employee info

		empInf.setId(116);
		empInf.setName("rrr");
		empInf.setAge(23);

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("2012-12-13");

		empInf.setGender("male");
		empInf.setSalary(10000);
		empInf.setPhone(782395723);
		empInf.setJoiningDate(date);
		empInf.setAccount_number(73285723);
		empInf.setEmail("q@gmail.com");
		empInf.setDesignation("developer");
		empInf.setDob(date);
		empInf.setDept_Id(1);
		empInf.setMngrId(200);

		// log.info("Inserted the employee info? Ans: " +
		// dao.createEmployeeInfo(empInf));
		log.info(" deleted"+dao.deleteEmployeeInfo(10));
	}

	private static void printData(EmployeeData bean) {
		log.info("Id is " + bean.getId());
		log.info("Name is " + bean.getName());
		log.info("Age is " + bean.getAge());
		log.info("Gender is " + bean.getGender());
		log.info("Salary is " + bean.getSalary());
		log.info("Phone is " + bean.getPhone());
		log.info("Joiningdate is " + bean.getJoiningDate());
		log.info("AccountNumber is " + bean.getAccount_number());
		log.info("Email is " + bean.getEmail());
		log.info("Designation is " + bean.getDesignation());
		log.info("Dob is " + bean.getDob());
		log.info("DepartmentId is " + bean.getDept_Id());
		log.info("ManagerId is " + bean.getMngrId());

	}
}
