package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;
import lombok.extern.java.Log;

@Log
public class UpdateDynamic {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		//String hql = "update from EmployeeInfoBean set name=:nm where id=:eid";

		 String hql = "update from EmployeeInfoBean set name='"+args[0]+"' where id="+Integer.parseInt(args[1]);

		Query query = session.createQuery(hql);
		
		//query.setParameter("nm", args[0]);
		//query.setParameter("eid", args[1]);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();

			log.info("updated--: " + result);

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
