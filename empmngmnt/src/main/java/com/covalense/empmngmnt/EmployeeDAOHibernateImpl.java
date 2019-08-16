package com.covalense.empmngmnt;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	public List<EmployeeData> getAllEmployeeInfo() {
		Session session = HibernateUtil.openSession();
		String hql = "from EmployeeData";
		Query query = session.createQuery(hql);
		List<EmployeeData> employeeInfoBeans = query.list();
		return employeeInfoBeans;
	}

	public List<EmployeeData> getAllSearchedEmployee(String id) {

		Session session = HibernateUtil.openSession();
		String hql = "from EmployeeData where id like '" + id + "%'";
		Query query = session.createQuery(hql);
		List<EmployeeData> employeeInfoBeans = query.list();
		return employeeInfoBeans;
	}

	public EmployeeData getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	public EmployeeData getEmployeeInfo(int id) {
		// 1.Load the Configuration file

		Configuration cfg = new Configuration();
		cfg.configure(); // default hibernate config file
		cfg.addAnnotatedClass(EmployeeData.class);

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
		EmployeeData empInf = session.get(EmployeeData.class, id);

		// 5.Close session
		session.close();

		return empInf;
	}

	private boolean saveOrUpdate(EmployeeData bean) {
		Session session = HibernateUtil.openSession();
		session.saveOrUpdate(bean);
		return false;
	}

	public boolean createEmployeeInfo(EmployeeData bean) {
		return saveOrUpdate(bean);
	}

	public boolean updateEmployeeInfo(EmployeeData bean) {
		return saveOrUpdate(bean);
	}

	public boolean deleteEmployeeInfo(int id) {
		return false;
	}

	public boolean deleteEmployeeInfo(String id) {
		return false;
	}

}
