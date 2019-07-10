package com.covalense.hibernateapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import lombok.extern.java.Log;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

@Log
public class ToPrintEmpInfoByUtil {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		EmployeeInfoBean em = session.get(EmployeeInfoBean.class, 101);
		log.info("name is " + em.getName());
		session.close();
	}
}
