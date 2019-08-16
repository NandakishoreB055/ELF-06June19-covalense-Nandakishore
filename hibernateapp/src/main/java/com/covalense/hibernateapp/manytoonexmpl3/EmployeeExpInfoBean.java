package com.covalense.hibernateapp.manytoonexmpl3;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee_experience_info")
@Data
public class EmployeeExpInfoBean implements Serializable {

	@EmbeddedId
	private EmployeeExpPriKeyBean empExp;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	@Column(name = "LEAVING_DATE")
	private Date leavingDate;
}