package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestArray16 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(9.2);
		ll.add(1.5);
		ll.add(6.9);
		ll.add(2.4);
		ll.add(3.6);
		for (int i = 0; i < ll.size(); i++) {
			Object r = ll.get(i);
			System.out.println(r);
		}
		Iterator it = ll.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);

		}
		ListIterator lit = ll.listIterator();
		while (lit.hasNext()) {
			Object r = lit.next();
			System.out.println(r);
		}

	}

}
