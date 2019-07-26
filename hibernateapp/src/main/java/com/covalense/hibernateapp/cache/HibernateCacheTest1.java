package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import lombok.extern.java.Log;

@Log
public class HibernateCacheTest1 {

	public static void main(String[] args) {

		// 1.Load the config file
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);

		// 2.Build session factory
		SessionFactory sessionFactory = config.buildSessionFactory();

		// 3.Open session
		Session session = sessionFactory.openSession();

		// 4.Interact with DB via Session
		NewEmployeeInfoBean bean = session.get(NewEmployeeInfoBean.class, 101);
		log.info("1st time " + bean.toString());

		NewEmployeeInfoBean bean1 = session.get(NewEmployeeInfoBean.class, 101);
		log.info("2nd time " + bean1.toString());

		NewEmployeeInfoBean bean2 = session.get(NewEmployeeInfoBean.class, 101);
		log.info("3rd time " + bean2.toString());

		// 5.Close the Session
		session.close();

	}

}
