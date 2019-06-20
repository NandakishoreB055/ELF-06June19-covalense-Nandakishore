package com.covalense.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapping {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);

		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();

			System.out.println("key is " + e.getKey());
			System.out.println("value is " + e.getValue());
			
			System.out.println("******************");
		}
	}

}
