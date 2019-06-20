package com.covalense.java.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemapping {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("onnn", 1);
		tm.put("obbb", 2);
		tm.put("occcc", 3);

		for (Map.Entry<String, Integer> e : tm.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();

			System.out.println("key is " + e.getKey());
			System.out.println("value is " + e.getValue());

			System.out.println("******************");
		}
	}

}
