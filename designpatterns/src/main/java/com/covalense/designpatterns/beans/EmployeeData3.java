package com.covalense.designpatterns.beans;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.ToString;
@Builder
@ToString
public final class EmployeeData3 implements Serializable {
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
