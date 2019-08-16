package com.covalense.springcore.beans.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmppBean;

public class DeptConfig {
	@Bean
	@Scope("prototype")
	public DepartmentBean getDepartmentBean() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(7);
		departmentBean.setDeptName("DEV");
		return departmentBean;
	}

}
