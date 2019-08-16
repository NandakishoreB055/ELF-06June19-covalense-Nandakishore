package com.covalense.hibernateapp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import lombok.extern.java.Log;

@Log

public class OneToOneTest {
	public static void main(String[] args) {
		EmployeeInfoBean bean =new EmployeeInfoBean();

		bean.setId(4);
		bean.setName("qqq");
		bean.setAge(23);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse("2012-12-13");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		bean.setGender("male");
		bean.setSalary(10000);
		bean.setPhone(782395723);
		bean.setJoiningDate(date);
		bean.setAccount_number(73285723);
		bean.setEmail("q@gmail.com");
		bean.setDesignation("developer");
		bean.setDob(date);
		bean.setDept_Id(1);
		bean.setMngrId(200);
		bean.setPassword("555");

		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		otherInfoBean.setPan(62357526);
		otherInfoBean.setIsMarried("no");
		otherInfoBean.setBloodGroup("o+");
		otherInfoBean.setIschallenged("no");
		otherInfoBean.setEmergencyContactNumber(89347689);
		otherInfoBean.setEmergencyContactperson("aaa");
		otherInfoBean.setNationality("indian");
		otherInfoBean.setReligion("hindu");
		otherInfoBean.setFatherNm("xxx");
		otherInfoBean.setMotherNm("yyy");
		otherInfoBean.setSpouseNm("zzz");
		otherInfoBean.setPassport(65378567);
		otherInfoBean.setAadhar(7583758);

		otherInfoBean.setInfoBean(bean);

		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(bean, otherInfoBean);

	}
}
