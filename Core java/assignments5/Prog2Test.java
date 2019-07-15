package com.covalense.java.assignments5;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Prog2Test {

	private static final Logger log = Logger.getLogger("Nanda");

	public static void main(String[] args) {
		ArrayList<Prog2> a = new ArrayList<Prog2>();
		Prog2 p1 = new Prog2();
		p1.setName("bhavani");
		p1.setId(101);
		p1.setMarks(70);
		Prog2 p4 = new Prog2();
		p4.setName("sahana");
		p4.setId(104);
		p4.setMarks(70);
		Prog2 p2 = new Prog2();
		p2.setName("anjali");
		p2.setId(102);
		p2.setMarks(80);
		Prog2 p3 = new Prog2();
		p3.setName("sahana");
		p3.setId(103);
		p3.setMarks(60);

		a.add(p1);
		a.add(p2);
		a.add(p3);
		for (Prog2 p : a) {
			log.info("name=" + p.getName() + " ID=" + p.getId() + " marks=" + p.getMarks());
		}

	}
}
