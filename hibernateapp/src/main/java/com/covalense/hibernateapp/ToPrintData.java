package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import lombok.extern.java.Log;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

@Log
public class ToPrintData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean empthe = session.get(EmployeeInfoBean.class, 101);

		empthe.setAge(25);

		session.update(empthe);
		log.info("updated name is " + empthe.getName());
		session.close();

	}
}
