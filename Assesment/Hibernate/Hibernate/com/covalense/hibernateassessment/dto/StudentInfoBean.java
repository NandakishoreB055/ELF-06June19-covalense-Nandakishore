package com.covalense.hibernateassessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student_info")
public class StudentInfoBean implements Serializable {
	@Id
	@Column(name = "rollnum")
	private int rollnum;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "mobileNo")
	private int mobileNo;
	@Column(name = "emailId")
	private String emailId;
	public void setOtherInfo(StudentOtherInfoBean otherBean) {
		// TODO Auto-generated method stub
		
	}
}
