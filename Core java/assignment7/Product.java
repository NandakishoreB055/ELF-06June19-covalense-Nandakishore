package com.covalense.java.assignment7;

import java.util.logging.Logger;

public class Product {
	private static final Logger log = Logger.getLogger("nanda");

	String name;
	int cost;
	double rating;

	public Product(String name, int cost, double rating) {
		super();
		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}

	void get() {
		log.info("name= " + name + "cost= " + cost + "rating= " + rating);
	}

}