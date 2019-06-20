package com.covalense.java.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapping {
	public static void main(String[] args) {
		LinkedHashMap<Character, Double> lhm = new LinkedHashMap<Character, Double>();
		lhm.put('a', 1.1);
		lhm.put('b', 2.2);
		lhm.put('c', 3.3);

		for (Map.Entry<Character, Double> e : lhm.entrySet()) {
			Character key = e.getKey();
			Double value = e.getValue();

			System.out.println("key is " + e.getKey());
			System.out.println("value is " + e.getValue());

			System.out.println("******************");
		}
	}

}
