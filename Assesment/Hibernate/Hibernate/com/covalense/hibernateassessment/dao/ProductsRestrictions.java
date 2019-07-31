package com.covalense.hibernateassessment.dao;

/*Qstn 2. Create a Table using following information, and add restrictions with appropriate conditions */

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernateassessment.dto.ProductBean;
import com.covalense.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ProductsRestrictions {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(ProductBean.class);
		
		/*Qstn A) : Get a list of Products, which has a price less than 100. */
		criteria.add(Restrictions.lt("price", 100.0));
		List<ProductBean> bean = criteria.list();
		for (ProductBean b : bean) {
			log.info("id" + b.getProductId());
			log.info("name" + b.getProductName());
		}
		
		/*Qstn B) : Get a list of Product, product name should start with "A". */
		criteria.add(Restrictions.like("productName", "A%"));
		List<ProductBean> bean1 = criteria.list();
		for (ProductBean b : bean1) {
			log.info("id" + b.getProductId());
			log.info("name" + b.getProductName());
		}
	}

}