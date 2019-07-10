package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDetailsByRestrictions {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);

		// 1.restricting with code factor
		// Criteria criteria =
		// session.createCriteria(EmployeeInfoBean.class).add(Restrictions.gt("salary",
		// 15000.0)).add(Restrictions.eq("gender", "male"));

		// 2.restricting with id
		/*
		  Criterion cr = Restrictions.eq("id", 101); 
		  criteria.add(cr); 
		 EmployeeInfoBean emp = (EmployeeInfoBean) criteria.uniqueResult(); log.info("result: " + emp);
		 List<EmployeeInfoBean> emp = criteria.list();
	    	for (EmployeeInfoBean employeeInfoBean : emp) {
			log.info("result: " + employeeInfoBean);
		}
		 */

		// 3.restricting on salary and gender
		/*
		  Criterion cr = Restrictions.gt("salary", 15000.0);
		  Criterion cr1 = Restrictions.eq("gender", "male"); criteria.add(cr); criteria.add(cr1);
		 */

		

	}
}
