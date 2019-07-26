package com.covalense.hibernateapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

import lombok.extern.java.Log;
@Log
public class PrepareDataUtil {

	private PrepareDataUtil() {

	}

	public static EmployeeInfoBean prepareData(int id)  {
		EmployeeInfoBean empInf = new EmployeeInfoBean();

		empInf.setId(id);
		empInf.setName("qqq");
		empInf.setAge(23);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse("2012-12-13");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		empInf.setGender("male");
		empInf.setSalary(10000);
		empInf.setPhone(782395723);
		empInf.setJoiningDate(date);
		empInf.setAccount_number(73285723);
		empInf.setEmail("q@gmail.com");
		empInf.setDesignation("developer");
		empInf.setDob(date);
		empInf.setDept_Id(1);
		empInf.setMngrId(200);
		empInf.setPassword("555");

		EmployeeOtherInfoBean otherInfo = new EmployeeOtherInfoBean();

		otherInfo.setPan(62357526);
		otherInfo.setIsMarried("no");
		otherInfo.setBloodGroup("o+");
		otherInfo.setIschallenged("no");
		otherInfo.setEmergencyContactNumber(89347689);
		otherInfo.setEmergencyContactperson("aaa");
		otherInfo.setNationality("indian");
		otherInfo.setReligion("hindu");
		otherInfo.setFatherNm("xxx");
		otherInfo.setMotherNm("yyy");
		otherInfo.setSpouseNm("zzz");
		otherInfo.setPassport(65378567);
		otherInfo.setAadhar(7583758);
		empInf.setId(id);

		empInf.setOtherInfo(otherInfo);
		return empInf;

	}

}
