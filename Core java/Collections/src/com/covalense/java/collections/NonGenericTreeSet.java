package com.covalense.java.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class NonGenericTreeSet {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(9.2);
		ts.add(1.5);
		ts.add(6.9);
		ts.add(2.4);
		ts.add(3.6);

		for (Object r : ts) {
			System.out.println(r);
		}
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			Object r = it.next();

		}
	}
}
