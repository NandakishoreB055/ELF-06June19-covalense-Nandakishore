package com.covalense.hibernateassessment.dao;

import com.covalense.hibernateassessment.dto.CustomerBean;

import lombok.extern.java.Log;

@Log
public class CRUDTest {

	public static void main(String[] args) {
		/* Create the Customer info */
		CustomerBean bean = new CustomerBean();
		bean.setId(1);
		bean.setFirstName("nanda");
		bean.setLastName("kishore");
		bean.setAddress("bangalore");
		bean.setContactNumber(1);
		bean.setCity("blre");
		bean.setCountry("India");
		bean.setState("karnataka");
		CustomerDAO dao = new CustomerCRUDOperation();
		dao.createCustomer(bean);

		/* Update the Customer info */
		dao.updateCustomer(1);

		/* Read the  Customer info */
		CustomerBean bean1 = dao.readCustomer(1);
		log.info("ID " + bean1.getId());
		log.info("First Name " + bean1.getFirstName());
		log.info("Last name " + bean1.getLastName());
		log.info("address " + bean1.getAddress());
		log.info("City " + bean1.getCity());
		log.info("State " + bean1.getState());
		log.info("Country " + bean1.getCountry());
		log.info("Contact number " + bean1.getContactNumber());

		/* Delete the  Customer info */
		dao.deleteCustomer(1);
	}

}