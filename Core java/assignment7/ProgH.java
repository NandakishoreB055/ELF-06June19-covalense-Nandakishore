package com.covalense.java.assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ProgH {
	private static final Logger log = Logger.getLogger("nanda");

	public static void main(String[] args) {
		Emp emp1 = new Emp("nanda", 6, 2, "software engg");
		Emp emp2 = new Emp("kishore", 8, 4, "management");
		Emp emp3 = new Emp("sindhu", 3, 1, "testing");
		Emp emp4 = new Emp("priya", 9, 3, "developer");
		Emp emp5 = new Emp("kavya", 2, 2, "IT");
		ArrayList<Emp> t = new ArrayList<Emp>();
		t.add(emp1);
		t.add(emp2);
		t.add(emp3);
		t.add(emp4);
		t.add(emp5);

		Predicate<Emp> x1 = i -> i.exp >= 2 && i.job == "software engg";

		List<Emp> x = t.stream().filter(x1).collect(Collectors.toList());
		for (Emp s : x) {
			log.info("" + s);

		}
	}
}