package com.covalense.designpatterns.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.util.HibernateUtil;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

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

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		// 1.Load the Configuration file

		Configuration cfg = new Configuration();
		cfg.configure(); // default hibernate config file
		cfg.addAnnotatedClass(EmployeeInfoBean.class);

		// cfg.configure("MyHibernate.cfg.xml"); in source

		// cfg.configure("com/covalense/designpatterns/MyHibernate.cfg.xml"); in another
		// package

		// cfg.configure(new File("D:\\MyHibernate.cfg.xml")); in any drive

		// Giving the url where the hibernate.cfg.xml is pushed.
		/*
		 * try { cfg.configure(new URL(
		 * "https://raw.githubusercontent.com/NandakishoreB055/ELF-06June19-covalense-Nandakishore/master/Core%20java/MyHibernate.cfg.xml"
		 * )); } catch (HibernateException | MalformedURLException e) {
		 * e.printStackTrace(); }
		 */

		// 2.Build the SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();

		// 3.Open session
		Session session = factory.openSession();

		// 4.Interact with DB via session
		EmployeeInfoBean empInf = session.get(EmployeeInfoBean.class, id);

		// 5.Close session
		session.close();

		return empInf;
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Session session = HibernateUtil.openSession();
		session.saveOrUpdate(bean);
		return false;
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
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return false;
	}

}
