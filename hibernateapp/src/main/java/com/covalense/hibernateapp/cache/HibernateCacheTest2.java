package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {

	public static void main(String[] args) {
		log.info("1st time " + getEmployeeData(101).toString());
		log.info("2nd time " + getEmployeeData(101).toString());
		log.info("3rd time " + getEmployeeData(101).toString());
		log.info("4th time " + getEmployeeData(101).toString());
	}

	private static NewEmployeeInfoBean getEmployeeData(int id) {

		NewEmployeeInfoBean bean;
		try (Session session = HibernateCacheUtil.openSession();) {
			bean = session.get(NewEmployeeInfoBean.class, id);
		}
		return bean;

	}
}
