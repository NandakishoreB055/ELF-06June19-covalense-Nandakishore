package com.covalense.hibernateassessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student_Otherinfo")
public class StudentOtherInfoBean implements Serializable {
	@Id
	@Column(name = "rollnum")
	private int rollNum;
	@Column(name = "fatherName")
	private String fatherName;
	@Column(name = "motherName")
	private String motherName;
	@Column(name = "religion")
	private String religion;
	@Column(name = "nationality")
	private String nationality;
}
