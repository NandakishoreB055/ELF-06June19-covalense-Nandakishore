package com.covalense.hibernateapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.util.HibernateUtil;
import lombok.extern.java.Log;

@Log
public class GetDetailsByStoredProcedure {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("employee_info_sp");
		List<Object[]> list = query.getResultList();
		for (Object[] object : list) {
			log.info("Result is :" + object[1]);
		}
	}

}
