package com.covalense.hibernateapp.manytomany;

import java.util.Arrays;

import com.covalense.hibernateapp.manytoonexmpl1.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoonexmpl1.EmployeeAddressInfoPriKeyBean;
import com.covalense.hibernateapp.manytoonexmpl1.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.manytoonexmpl2.EmployeeEducationBean;
import com.covalense.hibernateapp.manytoonexmpl2.EmployeeEducationPriKeyBean;

import lombok.extern.java.Log;

@Log

public class ManyToManyTestByBiDirect {
	public static void main(String[] args) {
		EmployeeInfoBean bean1 = new EmployeeInfoBean();
		bean1.setId(28);
		bean1.setName("dddd");
		bean1.setAge(23);
		bean1.setGender("male");
		bean1.setSalary(10000);
		bean1.setPhone(782395723);
		bean1.setAccount_number(73285723);

		EmployeeOtherInfoBean otherinfoBean = new EmployeeOtherInfoBean();
		otherinfoBean.setAadhar(43432);
		otherinfoBean.setPan(4234525);
		otherinfoBean.setInfoBean(bean1);
		bean1.setEmployeeOtherInfoBean(otherinfoBean);
		
		//For Address info
		EmployeeAddressInfoPriKeyBean addressPKBean1=new EmployeeAddressInfoPriKeyBean();
		addressPKBean1.setAddressType("U");
		//addressPKBean1.setInfoBean(bean1);
		
		EmployeeAddressInfoPriKeyBean addressPKBean2=new EmployeeAddressInfoPriKeyBean();
		addressPKBean2.setAddressType("P");
		//addressPKBean2.setInfoBean(bean1);
		
		EmployeeAddressInfoBean addressInfoBean1=new EmployeeAddressInfoBean();
		addressInfoBean1.setAddressPKBean(addressPKBean1);
		addressInfoBean1.setAddress1("fdag");
		addressInfoBean1.setAddress2("fdgaghhba");
		
		EmployeeAddressInfoBean addressInfoBean2=new EmployeeAddressInfoBean();
		addressInfoBean2.setAddressPKBean(addressPKBean2);
		addressInfoBean2.setAddress1("lkjlk");
		addressInfoBean2.setAddress2("czxvxv");
		
		//For education info
		EmployeeEducationPriKeyBean educationPKBean1=new EmployeeEducationPriKeyBean();
		educationPKBean1.setEducationType("sdgvg");
		//addressPKBean1.setInfoBean(bean1);
		
		EmployeeEducationPriKeyBean educationPKBean2=new EmployeeEducationPriKeyBean();
		educationPKBean2.setEducationType("sfdgh");
		//addressPKBean2.setInfoBean(bean1);
		
		EmployeeEducationBean eduPKBean1=new EmployeeEducationBean();
		eduPKBean1.setEducationPKBean(educationPKBean1);
		//addressPKBean1.setInfoBean(bean1);
		
		EmployeeEducationBean eduPKBean2=new EmployeeEducationBean();
		eduPKBean2.setEducationPKBean(educationPKBean2);
		//addressPKBean2.setInfoBean(bean1);
		
		
		
		
		
		HibernateImplForManagerId impl=new HibernateImplForManagerId();
		impl.createEmployee(bean1);
		
		bean1.setAddressInfoBean(Arrays.asList(addressInfoBean1,addressInfoBean2));
		
	}
}
