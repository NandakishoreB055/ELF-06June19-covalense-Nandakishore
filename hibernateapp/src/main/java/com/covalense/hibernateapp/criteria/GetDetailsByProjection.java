package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;
import lombok.extern.java.Log;

@Log
public class GetDetailsByProjection {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection pro = Projections.property("name");
		criteria.setProjection(pro);
		List<String> emp = criteria.list();
		for (String employeeInfoBean : emp) {
			log.info("Result: " + employeeInfoBean);
		}

	}

}
