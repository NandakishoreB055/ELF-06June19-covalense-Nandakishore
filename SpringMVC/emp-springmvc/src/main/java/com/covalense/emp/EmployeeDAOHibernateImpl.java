package com.covalense.emp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

public final class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory hibernateUtil;

	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = hibernateUtil.openSession();
		String hql = "from EmployeeData";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();
		return employeeInfoBeans;
	}

	public List<EmployeeInfoBean> getAllSearchedEmployee(String id) {

		Session session = hibernateUtil.openSession();
		String hql = "from EmployeeData where id like '" + id + "%'";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();
		return employeeInfoBeans;
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

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
		Session session = hibernateUtil.openSession();
		session.saveOrUpdate(bean);
		return false;
	}

	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean deleteEmployeeInfo(int id) {
		return false;
	}

	public boolean deleteEmployeeInfo(String id) {
		return false;
	}

	@Override
	public List<EmployeeInfoBean> getAllSearchedEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
