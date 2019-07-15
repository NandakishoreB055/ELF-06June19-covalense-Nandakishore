package com.covalense.java.assignments5;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Prog3Test {

	private static final Logger log = Logger.getLogger("Nanda");

	public static void main(String[] args) {
		ArrayList<Prog3> a = new ArrayList<Prog3>();
		Prog3 p1 = new Prog3();
		p1.setName("pen");
		p1.setCost(10);
		p1.setRating(4.5);
		Prog3 p2 = new Prog3();
		p2.setName("marker");
		p2.setCost(2200);
		p2.setRating(4.5);
		Prog3 p3 = new Prog3();
		p3.setName("phone");
		p3.setCost(40000);
		p3.setRating(4.5);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		for (Prog3 p : a) {
			if (p.getCost() > 2000)
				log.info("name=" + p.getName() + " cost=" + p.getCost() + " rating=" + p.getRating());
		}

	}
}
