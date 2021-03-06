package com.covalense.mywebapp.dao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
public class EmployeeData implements Serializable {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "salary")
	private double salary;
	@Column(name = "phone")
	private int phone;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "account_number")
	private int account_number;
	@Column(name = "email")
	private String email;
	@Column(name = "designation")
	private String designation;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "dept_id")
	private int dept_Id;
	@Column(name = "mngr_id")
	private int mngrId;

}
