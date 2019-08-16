package com.covalense.hibernateapp.manytoonexmpl1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_address_info")
public class EmployeeAddressInfoBean implements Serializable {
	
	@EmbeddedId
	private EmployeeAddressInfoPriKeyBean addressPKBean;
	
	@Column(name = "ADDRESS1")
	private String address1;
	@Column(name = "ADDRESS2")
	private String address2;
	@Column(name = "LANDMARK")
	private String landmark;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "PINCODE")
	private String pincode;
}
