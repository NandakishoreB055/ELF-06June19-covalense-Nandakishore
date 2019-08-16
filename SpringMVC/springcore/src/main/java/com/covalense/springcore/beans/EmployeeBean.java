package com.covalense.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class EmployeeBean implements InitializingBean, DisposableBean {
	private String name;
	private int id;

	public void destroy() throws Exception {
		log.info("destroy method");
	}

	public void afterPropertiesSet() throws Exception {
		log.info("initialize method");

	}

}
