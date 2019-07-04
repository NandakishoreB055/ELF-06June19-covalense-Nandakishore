package com.covalense.jdbcapp.beans;

import lombok.Data;

@Data
public class EmployeeAddressInfoBean {

	private int id;
	private String addresType;
	private String address1;
	private String address2;
	private String landmark;
	private String city;
	private String state;
	private int pincode;

}
