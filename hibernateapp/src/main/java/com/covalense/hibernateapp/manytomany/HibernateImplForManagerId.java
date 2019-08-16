package com.covalense.hibernateapp.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateImplForManagerId {

	private Configuration config = new Configuration();

	private SessionFactory factory = config.configure().buildSessionFactory();


	public void createEmployee(EmployeeInfoBean infoBean) {
		Session session1 = factory.openSession();
		Transaction transaction1 = session1.beginTransaction();
		session1.save(infoBean);
		transaction1.commit();
		session1.close();
	}

	public EmployeeInfoBean getEmployeeBean(int id) {
		Session session2 = factory.openSession();
		EmployeeInfoBean bean = session2.get(EmployeeInfoBean.class, id);
		session2.close();
		return bean;
	}
	
	public void createTraining(TrainingInfoBean trainingInfoBean) {
		Session session3 = factory.openSession();
		Transaction transaction2 = session3.beginTransaction();
		session3.save(trainingInfoBean);
		transaction2.commit();
		session3.close();
	}

}