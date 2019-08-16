package com.covalense.hibernateapp.manytomany;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log

public class ManyToManyTestForTrainingInfo {
	public static void main(String[] args) {
		TrainingInfoBean bean=new TrainingInfoBean();
		bean.setCourse_id(71);
		bean.setCourse_nm("java");
		
		HibernateImplForManagerId implT=new HibernateImplForManagerId();
		
		//For existing emp_Id
		EmployeeInfoBean infoBean1=implT.getEmployeeBean(2);
		
		//For non-existing emp_Id
		EmployeeInfoBean infoBean2=new EmployeeInfoBean();
		infoBean2.setId(51);
		infoBean2.setName("krrish");
		
		bean.setInfoBeans(Arrays.asList(infoBean1,infoBean2));
		
		implT.createTraining(bean);
	}
}
