package com.covalense.hibernateassessment.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateassessment.util.HibernateUtil;

/*Qstn 6. Write a logic to get a Student detail with the help of rollNum and subject by using Named Queries.*/
import lombok.extern.java.Log;

@Log
public class NamedQueries {

	public static void main(String[] args) {
		Transaction trans = null;
		try (Session session = HibernateUtil.openSession()) {
			NamedQueries query = (NamedQueries) session
					.createQuery("from StudentBean where rollNum=: rollnum and subject=: subj");
			((Query) query).setParameter("rollnum", 1);
			((Query) query).setParameter("subj", "java");
			trans = session.beginTransaction();
			int rows = ((Query) query).executeUpdate();
			trans.commit();
		} catch (Exception e) {
			log.info("Exception" + e);
			trans.rollback();
		}
	}

}