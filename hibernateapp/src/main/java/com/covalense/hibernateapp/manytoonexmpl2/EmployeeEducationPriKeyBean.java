package com.covalense.hibernateapp.manytoonexmpl2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.Data;


@Data
@Embeddable
public class EmployeeEducationPriKeyBean implements Serializable {
	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;

	@Column(name = "EDUCATION_TYPE")
	private String educationType;
}
