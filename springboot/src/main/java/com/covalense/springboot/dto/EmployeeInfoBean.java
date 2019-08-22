package com.covalense.springboot.dto;

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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "employee_info")
@JsonRootName(value = "employee-info-bean")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class EmployeeInfoBean implements Serializable {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private Integer age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "salary")
	private Double salary;

	@Column(name = "phnum")
	private Integer phnum;

	@Column(name = "joining_date")
	private Date joiningDate;

	@Column(name = "account_number")
	private Integer accountNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "designation")
	private String designation;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "dept_id")
	private Integer departmentId;

	@Column(name = "password")
	private String password;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "mngr_id", referencedColumnName = "id")
	private EmployeeInfoBean managerId;

	@JsonProperty(value = "address-Infobean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empPK.infoBean")
	private List<EmployeeAddresInfoBean> addressInfobean;

	@JsonProperty(value = "edu-Info-bean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "eduPk.infoBean")
	private List<EmployeeEducationInfoBean> eduInfobean;

	@JsonProperty(value = "exp-Info-bean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empExp.infoBean")
	private List<EmployeeExperinceInfoBean> expInfobean;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "otherinfobean")
	@JsonProperty(value = "other-info")
	private EmployeeOtherInfoBean otherInfo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getPhnum() {
		return phnum;
	}

	public void setPhnum(Integer phnum) {
		this.phnum = phnum;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EmployeeInfoBean getManagerId() {
		return managerId;
	}

	public void setManagerId(EmployeeInfoBean managerId) {
		this.managerId = managerId;
	}

	public List<EmployeeAddresInfoBean> getAddressInfobean() {
		return addressInfobean;
	}

	public void setAddressInfobean(List<EmployeeAddresInfoBean> addressInfobean) {
		this.addressInfobean = addressInfobean;
	}

	public List<EmployeeEducationInfoBean> getEduInfobean() {
		return eduInfobean;
	}

	public void setEduInfobean(List<EmployeeEducationInfoBean> eduInfobean) {
		this.eduInfobean = eduInfobean;
	}

	public List<EmployeeExperinceInfoBean> getExpInfobean() {
		return expInfobean;
	}

	public void setExpInfobean(List<EmployeeExperinceInfoBean> expInfobean) {
		this.expInfobean = expInfobean;
	}

	public EmployeeOtherInfoBean getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(EmployeeOtherInfoBean otherInfo) {
		this.otherInfo = otherInfo;
	}

}
