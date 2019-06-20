package com.covalense.java.comparator;

import java.util.Comparator;

public class EmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		if (s1.salary > s2.salary) {
			return 1;

		} else if (s1.salary < s2.salary) {
			return -1;
		} else {
			return 0;
		}
	}

}
