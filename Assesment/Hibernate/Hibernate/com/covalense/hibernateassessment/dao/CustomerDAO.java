package com.covalense.hibernateassessment.dao;

import com.covalense.hibernateassessment.dto.CustomerBean;

public interface CustomerDAO {
	public void createCustomer(CustomerBean bean);

	public void updateCustomer(int id);

	public void deleteCustomer(int id);

	public CustomerBean readCustomer(int id);
}