package com.covalense.java.arraysort;

import java.util.Arrays;

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeBean[] emp = new EmployeeBean[4];
		EmployeeBean e1 = new EmployeeBean();
		e1.setName("nanda");
		e1.setAge(22);
		e1.setSalary(20000.0);

		EmployeeBean e2 = new EmployeeBean();
		e2.setName("kishore");
		e2.setAge(22);
		e2.setSalary(20000.0);

		EmployeeBean e3 = new EmployeeBean();
		e3.setName("priya");
		e3.setAge(22);
		e3.setSalary(20000.0);

		EmployeeBean e4 = new EmployeeBean();
		e4.setName("priyanka");
		e4.setAge(22);
		e4.setSalary(20000.0);

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		
		
		
		for (EmployeeBean e : emp) {
			System.out.println("name is" + e.getName());
			System.out.println("age is" + e.getAge());
			System.out.println("salary is" + e.getSalary());
		}
	}

}
