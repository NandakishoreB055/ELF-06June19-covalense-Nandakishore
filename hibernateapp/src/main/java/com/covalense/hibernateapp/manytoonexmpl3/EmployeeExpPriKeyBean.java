package com.covalense.hibernateapp.manytoonexmpl3;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.Data;

@Embeddable
@Data
public class EmployeeExpPriKeyBean implements Serializable {
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;
	@Column(name = "COMPANY_NM")
	private String companyNM;
}