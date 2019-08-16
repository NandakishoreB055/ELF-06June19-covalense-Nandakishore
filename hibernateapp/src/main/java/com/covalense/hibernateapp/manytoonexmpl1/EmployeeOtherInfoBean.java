package com.covalense.hibernateapp.manytoonexmpl1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.covalense.hibernateapp.manytomany.EmployeeInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_otherinfo")
public class EmployeeOtherInfoBean implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name = "id")
	// @PrimaryKeyJoinColumn(name = "id")
	private EmployeeInfoBean infoBean;

	@Column(name = "pan")
	private int pan;
	@Column(name = "ismarried")
	private String isMarried;
	@Column(name = "blood_group")
	private String bloodGroup;
	@Column(name = "ischallenged")
	private String ischallenged;
	@Column(name = "emergency_contact_number")
	private int emergencyContactNumber;
	@Column(name = "emergency_contact_person")
	private String emergencyContactperson;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "religion")
	private String religion;
	@Column(name = "father_nm")
	private String fatherNm;
	@Column(name = "mother_nm")
	private String motherNm;
	@Column(name = "spouse_nm")
	private String spouseNm;
	@Column(name = "passport")
	private int passport;
	@Column(name = "aadhar")
	private int aadhar;

}
