package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Embeddable
//@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ExpPK implements Serializable {
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;
	private String companyNm;

}
