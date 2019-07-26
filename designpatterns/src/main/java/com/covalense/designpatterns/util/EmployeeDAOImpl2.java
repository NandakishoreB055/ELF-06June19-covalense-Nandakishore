package com.covalense.designpatterns.util;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.designpatterns.builder.EmployeeData;
import com.covalense.designpatterns.dao.EmployeeDAO;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOImpl2 implements EmployeeDAO {

	@Override
	public List<EmployeeData> getAllEmployeeInfo() {
		Session session = HibernateUtil.openSession();
		String hql = " from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<EmployeeData> ename = query.list();
		return ename;
	}

	@Override
	public EmployeeData getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	private boolean saveOrUpdate(EmployeeData bean) {
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
	public boolean createEmployeeInfo(EmployeeData bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeData bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		Session session;
		EmployeeData bean = new EmployeeData();
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
	public EmployeeData getEmployeeInfo(int id) {
		return null;
	}

}
