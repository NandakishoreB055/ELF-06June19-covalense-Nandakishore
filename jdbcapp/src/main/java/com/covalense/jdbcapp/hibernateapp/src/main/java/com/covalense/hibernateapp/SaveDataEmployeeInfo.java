package com.covalense.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

public class SaveDataEmployeeInfo {

	public static void main(String[] args) throws ParseException {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		empInf.setId(114);
		empInf.setName("qqq");
		empInf.setAge(23);
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date=format.parse("2012-12-13");
		empInf.setGender("male");
		empInf.setSalary(10000);
		empInf.setPhone(782395723);
		empInf.setJoiningDate(date);
		empInf.setAccount_number(73285723);
		empInf.setEmail("q@gmail.com");
		empInf.setDesignation("developer");
		empInf.setDob(date);
		empInf.setDept_Id(1);
		empInf.setMngrId(200);

		Transaction transaction = session.beginTransaction();
		session.save(empInf);
		transaction.commit();
		session.close();

	}

}
