package com.covalense.hibernateapp.manytoonexmpl1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log

public class ManyToOneTest {
	public static void main(String[] args) {
		EmployeeInfoBean bean = new EmployeeInfoBean();

		bean.setId(5);
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

		//otherInfoBean.setInfoBean(bean);

		EmployeeAddressInfoPriKeyBean addressPKBean1 = new EmployeeAddressInfoPriKeyBean();
		addressPKBean1.setAddressType("T");
		addressPKBean1.setInfoBean(bean);

		EmployeeAddressInfoPriKeyBean addressPKBean2 = new EmployeeAddressInfoPriKeyBean();
		addressPKBean2.setAddressType("R");
		addressPKBean2.setInfoBean(bean);

		EmployeeAddressInfoBean addressInfo1 = new EmployeeAddressInfoBean();
		addressInfo1.setAddressPKBean(addressPKBean1);
		addressInfo1.setAddress1("XYZ");
		addressInfo1.setAddress2("ABC");
		addressInfo1.setCity("bangalore");
		addressInfo1.setState("karnataka");
		addressInfo1.setPincode("42343");
		addressInfo1.setLandmark("asdfg");

		EmployeeAddressInfoBean addressInfo2 = new EmployeeAddressInfoBean();
		addressInfo2.setAddressPKBean(addressPKBean2);
		addressInfo2.setAddress1("PQR");
		addressInfo2.setAddress2("DEF");
		addressInfo2.setCity("mandya");
		addressInfo2.setState("karnataka");
		addressInfo2.setPincode("43458");
		addressInfo2.setLandmark("cvbbvf");

		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(bean, otherInfoBean, Arrays.asList(addressInfo1, addressInfo2));

	}
}
