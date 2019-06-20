package com.covalense.java.comparator;

import java.util.TreeSet;

public class EmployeeTree {

	public static void main(String[] args) {

		EmployeeById i = new EmployeeById();
		EmployeeBySalary s = new EmployeeBySalary();
		EmployeeByName n = new EmployeeByName();

		TreeSet<Employee> t = new TreeSet<Employee>(n);

		Employee E1 = new Employee();
		E1.name = "nanda";
		E1.id = 200;
		E1.salary = 20000.0;

		Employee E2 = new Employee();
		E2.name = "kishore";
		E2.id = 300;
		E2.salary = 18000.0;

		Employee E3 = new Employee();
		E3.name = "priya";
		E3.id = 500;
		E3.salary = 44000.0;

		Employee E4 = new Employee();
		E4.name = "divya";
		E4.id = 400;
		E4.salary = 2000.0;

		t.add(E1);
		t.add(E2);
		t.add(E3);
		t.add(E4);

		for (Employee E : t) {
			System.out.println("Name is " + E.name);
			System.out.println("Id is " + E.id);
			System.out.println("Salary is " + E.salary);
			System.out.println("***************");
		}
	}

}
