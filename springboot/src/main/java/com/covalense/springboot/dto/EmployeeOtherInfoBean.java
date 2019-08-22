package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "employee_other_info")
//@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class EmployeeOtherInfoBean implements Serializable {
	@JsonIgnore
	@Id
	@Column(name = "other_info")
	@GeneratedValue
	private int otherInfo;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "id", referencedColumnName = "id", unique = true, nullable = false)
	private EmployeeInfoBean otherinfobean;

	@Column(name = "pan")
	private Integer pan;

	@Column(name = "ismarried")
	private String isMarried;

	@Column(name = "blood_group")
	private String bloodGroup;

	@Column(name = "ischallenged")
	private String isChallenged;

	@Column(name = " emergency_contact_number ")
	private Integer emergencyContactNumber;

	@Column(name = "emergency_contact_name")
	private String emergencyContactName;

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

	@Column(name = "husband_nm")
	private String husbandNm;

	@Column(name = "passport")
	private Integer passport;

	@Column(name = "adhar")
	private Integer adhar;

}
