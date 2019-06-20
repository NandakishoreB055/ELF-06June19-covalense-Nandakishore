package com.covalense.java.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class valueSet {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("onnn", 1);
		tm.put("obbb", 2);
		tm.put("occcc", 3);
		
		System.out.println("values are:");
		Collection<Integer> c = tm.values();
		Iterator<Integer> it = c.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
			System.out.println(r);

		}
	}
}
