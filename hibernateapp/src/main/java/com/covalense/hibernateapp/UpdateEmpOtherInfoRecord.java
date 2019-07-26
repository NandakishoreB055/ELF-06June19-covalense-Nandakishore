package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class UpdateEmpOtherInfoRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeOtherInfoBean empthe = session.get(EmployeeOtherInfoBean.class, 101);

		empthe.setAadhar(847585678);

		Transaction transaction = session.beginTransaction();
		session.save(empthe);
		transaction.commit();
		session.close();

	}

}
