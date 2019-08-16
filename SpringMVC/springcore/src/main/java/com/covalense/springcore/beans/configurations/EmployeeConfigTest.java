package com.covalense.springcore.beans.configurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmppBean;

import lombok.extern.java.Log;

@Log
public class EmployeeConfigTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class,DeptConfig.class,MultipleDeptConfig.class);
		EmppBean employeeBean = applicationContext.getBean(EmppBean.class);
		DepartmentBean departmentBean = employeeBean.getDepartmentBean();
		log.info("emp id : " + employeeBean.getId());
		log.info("emp name : " + employeeBean.getName());

		log.info("dept id : " + departmentBean.getDeptId());
		log.info("dept name : " + departmentBean.getDeptName());

	}

}
