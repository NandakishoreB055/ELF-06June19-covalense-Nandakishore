package com.covalense.hibernateassessment.dao;

/*Qstn 3. Insert a data from existing table(Customer) to new table using HQL*/

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class InsertToLatestTable {

	public static void main(String[] args) {
		Transaction trans = null;
		try (Session session = HibernateUtil.openSession()) {
			Query query = session.createQuery(
					"insert into LatestCustomerBean(id, firstName, lastName, city) select id,firstName,lastName,city from CustomerBean where id = 1");
			trans = session.beginTransaction();
			int rows = query.executeUpdate();
			trans.commit();
		} catch (Exception e) {
			log.info("Exception" + e);
			trans.rollback();
		}
	}

}