package com.covalense.java.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class keySet {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("onnn", 1);
		tm.put("obbb", 2);
		tm.put("occcc", 3);

		System.out.println("keys are:");
		Set<String> ts = tm.keySet();
		for (String k : ts) {
			System.out.println(k);

		}
	}
}
