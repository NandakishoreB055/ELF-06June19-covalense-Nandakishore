package com.covalense.hibernateapp.onetoone;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.util.ModifiedHibernateUtil;
import com.covalense.hibernateapp.util.PrepareDataUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {

	public static void main(String[] args) throws ParseException {

		// Prepare Data
		int id = 555;
		EmployeeInfoBean data = PrepareDataUtil.prepareData(id);
		save(data);
	}
		// Save
		private static void save(EmployeeInfoBean data) {
			Transaction txn = null;
			try (Session session = ModifiedHibernateUtil.getSession()) {
				txn=session.beginTransaction();
				session.save(data);
				txn.commit();
			} catch (Exception ex) {
				//log.severe(Arrays.toString(ex.getStackTrace()));
				ex.printStackTrace();
				if (txn != null) {
					txn.rollback();
				}
		}
		
	}

}
