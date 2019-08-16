package com.covalense.hibernateapp.manytomany;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.covalense.hibernateapp.manytoonexmpl1.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoonexmpl1.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.manytoonexmpl2.EmployeeEducationBean;
import com.covalense.hibernateapp.manytoonexmpl3.EmployeeExpInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {

	// If Foreign key is not present
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationPKBean.infoBean")
	private List<EmployeeEducationBean> educationInfoBean;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empExp.infoBean")
	private List<EmployeeExpInfoBean> expInfoBean;

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
	private long phone;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "account_number")
	private long account_number;
	@Column(name = "email")
	private String email;
	@Column(name = "designation")
	private String designation;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "password")
	private String password;

	// For DeptId
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_id", referencedColumnName = "DEPT_ID")
	private DepartmentBean departmentBean;

	// For ManagerId
	@ManyToOne
	@JoinColumn(name = "mngr_id", referencedColumnName = "id")
	private EmployeeInfoBean mngrId;

}
