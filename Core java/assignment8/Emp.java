package com.covalense.java.assignment8;

import java.util.logging.Logger;

public class Emp {
	private static final Logger log = Logger.getLogger("nanda");

	String name;
	int id;
	int salary;
	String job;

	public Emp(String name, int id, int salary, String job) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", job=" + job + "]";
	}

}