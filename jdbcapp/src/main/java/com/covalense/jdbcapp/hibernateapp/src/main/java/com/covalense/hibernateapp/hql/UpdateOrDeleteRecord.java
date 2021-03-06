package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;
import lombok.extern.java.Log;

@Log
public class UpdateOrDeleteRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		//String hql = "update from EmployeeInfoBean set name='nanda' where id=101";
		
		//String hql = "delete from EmployeeInfoBean where id=11";
		
		String hql = "delete from EmployeeInfoBean where id=:eid";
		Query query = session.createQuery(hql);
		query.setParameter("eid",114);	
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			
			//log.info("updated--: " + result);
			
			log.info("deleted--: " + result);
			
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
