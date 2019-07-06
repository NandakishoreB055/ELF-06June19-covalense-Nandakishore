package com.covalense.designpatterns.util;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.dao.EmployeeDAO;

public class EmployeeDAOImpl2 implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		// TO-DO
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		Session session;
		try {
			session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		Session session;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		try {
			session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {

		return false;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		return null;
	}

}
