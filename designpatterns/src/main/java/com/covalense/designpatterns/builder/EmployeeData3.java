package com.covalense.designpatterns.builder;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


import javax.persistence.Id;
import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
@Builder
@Getter
@AllArgsConstructor
public class EmployeeData3 implements Serializable {
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joiningDate;
	private long account_number;
	private String email;
	private String designation;
	private Date dob;
	private int dept_Id;
	private int mngrId;

}
