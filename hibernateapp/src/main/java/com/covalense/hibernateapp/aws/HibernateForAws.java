package com.covalense.hibernateapp.aws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateForAws {
	public static void main(String[] args) throws ParseException {
		Configuration cfg = new Configuration();
		cfg.configure("com/covalense/hibernateapp/aws/hibernate.aws.cfg.xml");
		cfg.addAnnotatedClass(NewEmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		NewEmployeeInfoBean bean = new NewEmployeeInfoBean();
		bean.setId(114);
		bean.setName("qqq");
		bean.setAge(23);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("2012-12-13");
		bean.setGender("male");
		bean.setSalary(10000);
		bean.setPhone(782395723);
		bean.setJoiningDate(date);
		bean.setAccount_number(73285723);
		bean.setEmail("q@gmail.com");
		bean.setDesignation("developer");
		bean.setDob(date);
		bean.setDept_Id(1);
		bean.setMngrId(200);

		Transaction transaction = session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();

	}

}
