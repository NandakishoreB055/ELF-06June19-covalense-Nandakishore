package com.covalense.hibernateapp.manytoonexmpl1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

public class HibernateImpl {

	private Configuration config = new Configuration();

	private SessionFactory factory = config.configure().buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeAddressInfoBean> addressInfoBean) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBean) {
			session.save(employeeAddressInfoBean);
		}
		transaction.commit();
		session.close();
	}

}
