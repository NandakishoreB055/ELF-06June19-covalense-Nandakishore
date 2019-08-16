package com.covalense.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_otherinfo")
public class EmployeeOtherInfoBean {
	@Column(name = "pan")
	private String pan;
	@Column(name = "ismarried")
	private boolean isMarried;
	@Column(name = "blood_group")
	private String bloodGroup;
	@Column(name = "ischallenged")
	private boolean ischallenged;
	@Column(name = "emergency_contact_number")
	private long emergencyContactNumber;
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
	private String passport;
	@Column(name = "aadhar")
	private long aadhar;
	@Id
	@Column(name = "id")
	private int id;

}
