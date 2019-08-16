package com.covalense.empmngmnt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private HibernateUtil() {

	}

	private static SessionFactory buildSessionFactory() {
		return new Configuration().configure().addAnnotatedClass(EmployeeData.class).buildSessionFactory();
	}

	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;

	}

	public static Session openSession() {

		return getSessionFactory().openSession();

	}
}
