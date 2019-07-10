package com.covalense.hibernateapp.hql;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;
import lombok.extern.java.Log;

@Log
public class ReadDemo {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "select name from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<String> ename = query.list();
		for (String empname : ename) {
			log.info("name: " + empname);
		}

		
		// String hql = "name from EmployeeInfoBean";
		/*
		 * Query query = session.createQuery(hql); List<EmployeeInfoBean>
		 * employeeInfoBeans = query.list(); for (EmployeeInfoBean employeeInfoBean :
		 * employeeInfoBeans) { log.info("name: " + employeeInfoBean.getName());
		 * log.info("id : " + employeeInfoBean.getId()); log.info("age : " +
		 * employeeInfoBean.getAge()); log.info("Dob : " + employeeInfoBean.getDob());
		 * log.info("gender : " + employeeInfoBean.getGender());
		 * log.info("Designation : " + employeeInfoBean.getDesignation());
		 * log.info("Email : " + employeeInfoBean.getEmail());
		 */

	}
}
