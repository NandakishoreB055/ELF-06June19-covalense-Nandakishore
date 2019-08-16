package com.covalense.hibernateapp.manytoonexmpl2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.manytoonexmpl1.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoonexmpl1.EmployeeAddressInfoPriKeyBean;
import com.covalense.hibernateapp.manytoonexmpl1.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log

public class ManyToOneTest2 {
	public static void main(String[] args) {
		EmployeeInfoBean bean = new EmployeeInfoBean();

		bean.setId(7);
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
		addressPKBean1.setAddressType("y");
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

		EmployeeEducationPriKeyBean educationPKBean1 = new EmployeeEducationPriKeyBean();
		educationPKBean1.setEducationType("q");
		educationPKBean1.setInfoBean(bean);

		EmployeeEducationPriKeyBean educationPKBean2 = new EmployeeEducationPriKeyBean();
		educationPKBean2.setEducationType("w");
		educationPKBean2.setInfoBean(bean);

		EmployeeEducationBean educationInfo1 = new EmployeeEducationBean();
		educationInfo1.setEducationPKBean(educationPKBean1);
		educationInfo1.setBranch("cse");
		educationInfo1.setCollege_nm("sam");
		educationInfo1.setDegree_type("reg");
		educationInfo1.setPercentage("70.0");
		educationInfo1.setLocation("banglore");
		educationInfo1.setUniversity("vtu");
		educationInfo1.setYop("23-07-2019");

		EmployeeEducationBean educationInfo2 = new EmployeeEducationBean();
		educationInfo2.setEducationPKBean(educationPKBean2);
		educationInfo2.setBranch("ec");
		educationInfo2.setCollege_nm("sap");
		educationInfo2.setDegree_type("reg");
		educationInfo2.setPercentage("75.0");
		educationInfo2.setLocation("mandya");
		educationInfo2.setUniversity("vtu");
		educationInfo2.setYop("25-05-2019");

		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(bean, otherInfoBean, Arrays.asList(addressInfo1, addressInfo2),
				Arrays.asList(educationInfo1, educationInfo2));

	}
}
