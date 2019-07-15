package com.covalense.java.assignments5;

import java.util.TreeSet;
import java.util.logging.Logger;

public class Prog5Test {

	private static final Logger log = Logger.getLogger("Nanda");

	public static void main(String[] args) {
		TreeSet<Prog5> t = new TreeSet<Prog5>();
		Prog5 m1 = new Prog5();
		m1.set("MI", 20000, "MI");
		Prog5 m2 = new Prog5();
		m2.set("IPhone", 100000, "apple");
		Prog5 m3 = new Prog5();
		m3.set("note 2 MI ", 8000, "MI");
		Prog5 m4 = new Prog5();
		m4.set("galaxy 2", 20000, "sam");
		Prog5 m5 = new Prog5();
		m5.set("note 5", 20000, "sam");
		t.add(m1);
		t.add(m2);
		t.add(m3);
		t.add(m4);
		t.add(m5);

		for (Prog5 p : t) {
			log.info("name=" + p.name + " cost= " + p.cost + " brand=" + p.brand);
		}
	}

}
