package com.covalense.hibernateassessment.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateassessment.dto.CustomerBean;
import com.covalense.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CustomerCRUDOperation implements CustomerDAO {

	public void createCustomer(CustomerBean bean) {
		Transaction trans = null;
		try (Session session = HibernateUtil.openSession()) {
			trans = session.beginTransaction();
			session.save(bean);
			trans.commit();
		} catch (Exception e) {
			log.info("Exception" + e);
			trans.rollback();
		}
	}

	
	/* Update Customer */
	public void updateCustomer(int id) {
		Transaction trans = null;
		try (Session session = HibernateUtil.openSession()) {
			CustomerBean bean = session.get(CustomerBean.class, id);
			trans = session.beginTransaction();
			session.update(bean);
			trans.commit();
		} catch (Exception e) {
			log.info("Exception" + e);
			trans.rollback();
		}
	}

	/* Delete Customer */
	public void deleteCustomer(int id) {
		Transaction trans = null;
		try (Session session = HibernateUtil.openSession()) {
			CustomerBean bean = session.get(CustomerBean.class, id);
			trans = session.beginTransaction();
			session.delete(bean);
			trans.commit();
		} catch (Exception e) {
			log.info("Exception" + e);
			trans.rollback();
		}
	}

	/* Save Customer */
	public CustomerBean readCustomer(int id) {
		try (Session session = HibernateUtil.openSession()) {
			CustomerBean bean = session.get(CustomerBean.class, id);
			return bean;
		} catch (Exception e) {
			log.info("Exception" + e);
			return null;
		}
	}
}