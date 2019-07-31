package com.covalense.hibernateassessment.dao;

/*Qstn 5. Create an Entity with following details and write a logic to display firstName and totalMarks for all student.*/

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateassessment.dto.StudentBean;
import com.covalense.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StudProjections {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(StudentBean.class);
		Projection proj1 = Projections.property("firstName");
		Projection proj2 = Projections.property("totalMarks");
		ProjectionList projlist = Projections.projectionList();
		projlist.add(proj1);
		projlist.add(proj2);
		criteria.setProjection(projlist);
		List<Object[]> bean = criteria.list();
		for (Object[] b : bean) {
			log.info("name" + b[0]);
			log.info("total marks" + b[1]);
		}
	}

}