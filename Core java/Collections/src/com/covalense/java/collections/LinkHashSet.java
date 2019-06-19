package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSet {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(9.2);
		lhs.add(1.5);
		lhs.add(6.9);
		lhs.add(2.4);
		lhs.add(3.6);

		for (Object r : lhs) {
			System.out.println(r);
		}
		Iterator it = lhs.iterator();
		while (it.hasNext()) {
			Object r = it.next();

		}
	}

}
