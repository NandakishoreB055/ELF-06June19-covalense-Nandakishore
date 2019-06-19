package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class NonGenericHashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
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
			Object r = it.next();

		}
	}

}
