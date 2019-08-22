package com.covalense.springboot.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Employee_Experince_Info")
//@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class EmployeeExperinceInfoBean implements Serializable {
	@EmbeddedId
	private ExpPK empExp;
	private String designation;
	private Date joinimgDate;
	private Date leavingDate;

}
