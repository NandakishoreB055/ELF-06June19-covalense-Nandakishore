package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class SaveDataEmployeeOther {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeOtherInfoBean empInf = new EmployeeOtherInfoBean();
		empInf.setPan(62357526);
		empInf.setIsMarried("no");
		empInf.setBloodGroup("o+");
		empInf.setIschallenged("no");
		empInf.setEmergencyContactNumber(89347689);
		empInf.setEmergencyContactperson("aaa");
		empInf.setNationality("indian");
		empInf.setReligion("hindu");
		empInf.setFatherNm("xxx");
		empInf.setMotherNm("yyy");
		empInf.setSpouseNm("zzz");
		empInf.setPassport(65378567);
		empInf.setAadhar(7583758);
		empInf.setId(101);

		Transaction transaction = session.beginTransaction();
		session.save(empInf);
		transaction.commit();
		session.close();

	}

}
