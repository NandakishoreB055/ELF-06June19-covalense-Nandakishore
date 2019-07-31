package com.covalense.hibernateassessment.dao;

/*Qstn 8.Create a store Procedure on student table and write a program to call the same stored Procedure using hibernate*/

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

import com.covalense.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StudStoredProc {
	public static void main(String[] args) {
		try (Session session = HibernateUtil.openSession()) {
			StoredProcedureQuery storedProcedure = session.createStoredProcedureCall("StudentProcedure");
			List<Object[]> bean = storedProcedure.getResultList();
			for (Object[] b : bean) {
				log.info("Name " + b[1]);
			}
		} catch (Exception e) {
			log.info("Exception" + e);
		}
	}
}
