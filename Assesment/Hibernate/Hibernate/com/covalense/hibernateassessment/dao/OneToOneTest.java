package com.covalense.hibernateassessment.dao;

/*Qstn 10. Establish a relationship between following Entities, Using Hibernate Annotations (One-To-One)*/

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateassessment.dto.StudentInfoBean;
import com.covalense.hibernateassessment.dto.StudentOtherInfoBean;
import com.covalense.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class OneToOneTest {

	public static void main(String[] args) {
		StudentInfoBean bean = new StudentInfoBean();
		bean.setRollnum(1);
		bean.setName("nanda");
		bean.setAge(20);
		bean.setGender("male");
		bean.setEmailId("nanda@mail.com");
		bean.setMobileNo(1);

		StudentOtherInfoBean otherBean = new StudentOtherInfoBean();
		otherBean.setRollNum(1);
		otherBean.setFatherName("sdfgf");
		otherBean.setMotherName("ddgg");
		otherBean.setNationality("Indian");
		otherBean.setReligion("Hindu");
		bean.setOtherInfo(otherBean);

		Transaction trans = null;
		try (Session session = HibernateUtil.openSession()) {
			trans = session.beginTransaction();
			session.save(bean);
			trans.commit();
		} catch (Exception e) {
			log.info("Exception" + e);
			trans.rollback();
		}
	}

}