package com.covalense.java.constructors;

public class employee {

	String name;
	int id;
	double salary;

	employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	void display() {
		System.out.println("name is " + name);
		System.out.println("id is " + id);
		System.out.println("sal is " + salary);
	}
}
