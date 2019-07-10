package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;
import lombok.extern.java.Log;

@Log
public class GetDetailByProjections {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection pro1 = Projections.property("name");
		Projection pro2 = Projections.property("id");

		ProjectionList projectionList = Projections.projectionList();

		projectionList.add(pro1);
		projectionList.add(pro2);
		criteria.setProjection(projectionList);

		List<Object[]> str = criteria.list();
		for (Object[] employeeInfoBean : str) {
			log.info("Name : " + employeeInfoBean[0]);
			log.info("id : " + employeeInfoBean[1]);
		}
	}

}
