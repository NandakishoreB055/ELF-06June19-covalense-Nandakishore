package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemsBean;
import com.covalense.warehouse.config.ItemConfig;

import lombok.extern.java.Log;

@Log
public class GetItem {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ItemConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();
		ItemsBean ib = session.get(ItemsBean.class, 1);

		log.info("" + ib.getItemId());
		log.info("" + ib.getItemName());
		log.info("" + ib.getCost());
		log.info("" + ib.getDescription());
		log.info("" + ib.getCapacity());

	}
}