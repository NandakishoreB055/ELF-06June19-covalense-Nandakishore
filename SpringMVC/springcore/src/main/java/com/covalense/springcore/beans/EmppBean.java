package com.covalense.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.covalense.springcore.beans.interfaces.Animal;
import com.covalense.springcore.beans.interfaces.Pet;

import lombok.extern.java.Log;
import lombok.Data;

@Log
@Data
public class EmppBean implements InitializingBean, DisposableBean {
	private String name;
	private int id;
	@Autowired
	@Qualifier("Hr")
	public DepartmentBean departmentBean;

	/*
	 * public EmppBean(String name, int id, DepartmentBean departmentBean) {
	 * super(); this.name = name; this.id = id; this.departmentBean =
	 * departmentBean; }
	 */

	public void destroy() throws Exception {
		log.info("destroy method");
	}

	public void afterPropertiesSet() throws Exception {
		log.info("initialize method");

	}

}
