package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArray3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add("Kishore");
		al.add('a');
		al.add(99.9);
		al.add('w');
		al.add('q');
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);

		}
	}

}
