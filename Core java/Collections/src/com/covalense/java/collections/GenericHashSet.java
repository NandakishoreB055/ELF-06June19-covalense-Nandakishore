package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class GenericHashSet {

	public static void main(String[] args) {
		HashSet<Double> hs = new HashSet<Double>();
		hs.add(9.2);
		hs.add(1.5);
		hs.add(6.9);
		hs.add(2.4);
		hs.add(3.6);

		for (Object r : hs) {
			System.out.println(r);
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Double r = (Double) it.next();

		}
	}

}
