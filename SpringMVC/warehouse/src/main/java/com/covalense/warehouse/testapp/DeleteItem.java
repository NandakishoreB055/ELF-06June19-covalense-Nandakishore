package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemsBean;
import com.covalense.warehouse.config.ItemConfig;

public class DeleteItem {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ItemConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		try (Session session = factory.openSession()) {
			ItemsBean ib = session.get(ItemsBean.class, 1);
			Transaction trans = null;
			try {
				trans = session.beginTransaction();
				session.delete(ib);
				trans.commit();
			} catch (Exception e) {
				e.printStackTrace();
				trans.rollback();
			}
		}
	}

}
