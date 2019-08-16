package com.covalense.springcore.beans.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.covalense.springcore.beans.EmppBean;

@Configuration
@Import(DeptConfig.class)
public class EmployeeConfig {
	@Bean
	@Scope("prototype")
	public EmppBean getEmployeeBean() {
		EmppBean employeeBean = new EmppBean();
		employeeBean.setId(10);
		employeeBean.setName("kishore");
		return employeeBean;
	}

}
