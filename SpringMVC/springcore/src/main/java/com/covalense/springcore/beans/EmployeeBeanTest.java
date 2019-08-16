package com.covalense.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest {

	public static void main(String[] args) {
		
		//Having two xml files to get the data
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("importconfig.xml");

		EmppBean empBean1 = (EmppBean) applicationContext.getBean("emp");

		log.info("ID is : " + empBean1.getDepartmentBean().getDeptId());
		log.info("Name is : " + empBean1.getDepartmentBean().getDeptName());
		
		((AbstractApplicationContext) applicationContext).close();
	}

}
