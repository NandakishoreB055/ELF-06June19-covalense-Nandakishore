package com.covalense.hibernateapp.manytoonexmpl2;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.covalense.hibernateapp.manytoonexmpl1.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoonexmpl1.EmployeeAddressInfoPriKeyBean;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_educational_info")
public class EmployeeEducationBean {
	@EmbeddedId
	private EmployeeEducationPriKeyBean educationPKBean;
	
	@Column(name = "DEGREE_TYPE")
	private String degree_type;
	@Column(name = "BRANCH")
	private String branch;
	@Column(name = "COLLEGE_NM")
	private String college_nm;
	@Column(name = "UNIVERSITY")
	private String university;
	@Column(name = "YOP")
	private String yop;
	@Column(name = "PERCENTAGE")
	private String percentage;
	@Column(name = "LOCATION")
	private String location;
}
