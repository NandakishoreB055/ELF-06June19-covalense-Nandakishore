package com.covalense.java.implntlambda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmpTree {

	public static void main(String[] args) {

		Emp E1 = new Emp();
		E1.name = "nanda";
		E1.id = 200;
		E1.salary = 20000.0;

		Emp E2 = new Emp();
		E2.name = "kishore";
		E2.id = 300;
		E2.salary = 18000.0;

		Emp E3 = new Emp();
		E3.name = "priya";
		E3.id = 500;
		E3.salary = 44000.0;

		Emp E4 = new Emp();
		E4.name = "divya";
		E4.id = 400;
		E4.salary = 2000.0;

		Comparator<Emp> c = (e, f) -> {
			if (e.id > f.id) {
				return 1;
			} else if (e.id < f.id) {
				return -1;
			} else {
				return 0;
			}
		};

		TreeSet<Emp> t = new TreeSet<Emp>(c);

		t.add(E1);
		t.add(E2);
		t.add(E3);
		t.add(E4);

		for (Emp E : t) {
			log.info("Name is " + E.name);
			log.info("Id is " + E.id);
			log.info("Salary is " + E.salary);
			log.info("***************");
		}
	}

}
