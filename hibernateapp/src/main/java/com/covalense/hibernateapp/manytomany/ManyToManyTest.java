package com.covalense.hibernateapp.manytomany;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log

public class ManyToManyTest {
	public static void main(String[] args) {
		EmployeeInfoBean bean1 = new EmployeeInfoBean();
		bean1.setId(10);
		bean1.setName("dddd");
		bean1.setAge(23);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse("2012-12-13");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		bean1.setGender("male");
		bean1.setSalary(10000);
		bean1.setPhone(782395723);
		bean1.setJoiningDate(date);
		bean1.setAccount_number(73285723);
		bean1.setEmail("d@gmail.com");
		bean1.setDesignation("developer");
		bean1.setDob(date);
		bean1.setDept_Id(1);
		bean1.setMngrId(200);

		EmployeeInfoBean bean2 = new EmployeeInfoBean();
		bean2.setId(11);
		bean2.setName("ssss");
		bean2.setAge(23);
		SimpleDateFormat sformat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = null;
		try {
			date = sformat.parse("2012-12-13");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		bean2.setGender("male");
		bean2.setSalary(10000);
		bean2.setPhone(782395723);
		bean2.setJoiningDate(date1);
		bean2.setAccount_number(73285723);
		bean2.setEmail("s@gmail.com");
		bean2.setDesignation("developer");
		bean2.setDob(date);
		bean2.setDept_Id(1);
		bean2.setMngrId(200);

		EmployeeInfoBean bean3 = new EmployeeInfoBean();

		bean3.setId(12);
		bean3.setName("rrrr");
		bean3.setAge(23);
		SimpleDateFormat ssformat = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = null;
		try {
			date2 = ssformat.parse("2012-12-13");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		bean3.setGender("male");
		bean3.setSalary(10000);
		bean3.setPhone(782395723);
		bean3.setJoiningDate(date2);
		bean3.setAccount_number(73285723);
		bean3.setEmail("r@gmail.com");
		bean3.setDesignation("developer");
		bean3.setDob(date);
		bean3.setDept_Id(1);
		bean3.setMngrId(200);

		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourse_nm("java");
		trainingInfoBean.setCourse_id(57);
		trainingInfoBean.setCourse_type("aaa");
		trainingInfoBean.setDuration(10);

		//import proper package and decomment it
		//trainingInfoBean.setInfoBeans(Arrays.asList(bean1, bean2, bean3));

		HibernateImpl impl = new HibernateImpl();
		impl.createTraining(trainingInfoBean);

	}
}
