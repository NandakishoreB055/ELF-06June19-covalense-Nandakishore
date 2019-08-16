package com.covalense.hibernateapp.manytomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.manytoonexmpl1.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoonexmpl1.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.manytoonexmpl2.EmployeeEducationBean;
import com.covalense.hibernateapp.manytoonexmpl3.EmployeeExpInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

public class HibernateImpl {

	private Configuration config = new Configuration();

	private SessionFactory factory = config.configure().buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeAddressInfoBean> addressInfoBean, List<EmployeeEducationBean> educationInfoBean,
			List<EmployeeExpInfoBean> expInfoBean) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBean) {
			session.save(employeeAddressInfoBean);
		}

		for (EmployeeEducationBean employeeEducationBean : educationInfoBean) {
			session.save(employeeEducationBean);
		}

		for (EmployeeExpInfoBean employeeExpInfoBean : expInfoBean) {
			session.save(employeeExpInfoBean);
		}
		transaction.commit();
		session.close();
	}
	

	public void createTraining(TrainingInfoBean trainingInfoBean) {
		Session session1 = factory.openSession();
		Transaction transaction1 = session1.beginTransaction();
		session1.save(trainingInfoBean);
		transaction1.commit();
		session1.close();
	}

}