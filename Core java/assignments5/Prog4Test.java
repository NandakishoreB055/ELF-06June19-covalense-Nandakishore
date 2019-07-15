package com.covalense.java.assignments5;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Prog4Test {

	private static final Logger log = Logger.getLogger("Nanda");

	public static void main(String[] args) {
		ArrayList<Prog4> t = new ArrayList<Prog4>();
		Prog4 e1 = new Prog4();
		e1.name = "bhavani";
		e1.id = 1;
		e1.salary = 20000;

		Prog4 e2 = new Prog4();
		e2.name = "anjali";
		e2.id = 2;
		e2.salary = 30000;

		Prog4 e3 = new Prog4();
		e3.name = "sahana";
		e3.id = 3;
		e3.salary = 15000;

		Prog4 e4 = new Prog4();
		e4.name = "rashmi";
		e4.id = 4;
		e4.salary = 50000;

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		for (Prog4 e : t) {
			log.info("name=" + e.name + " id=" + e.id + " salary=" + e.salary);
		}

	}
}
