package com.covalense.springcore.beans.configurations;

import org.springframework.context.annotation.Bean;

import com.covalense.springcore.beans.DepartmentBean;

public class MultipleDeptConfig {
	@Bean(name="Dev")
	public DepartmentBean getDepartmentBean() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(7);
		departmentBean.setDeptName("DEV");
		return departmentBean;
	}
	
	@Bean(name="Hr")
	public DepartmentBean getDepartmentHr() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(8);
		departmentBean.setDeptName("HR");
		return departmentBean;
	}
	
	@Bean(name="Testing")
	public DepartmentBean getDepartmentTesting() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(9);
		departmentBean.setDeptName("Testing");
		return departmentBean;
	}

}
