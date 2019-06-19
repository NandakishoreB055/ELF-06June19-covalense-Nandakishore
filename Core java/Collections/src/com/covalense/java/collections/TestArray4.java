package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArray4 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add("Kishore");
		al.add('a');
		al.add(99.9);
		al.add('w');
		al.add('q');
		ListIterator lit = al.listIterator();
		while (lit.hasNext()) {
			Object r = lit.next();
			System.out.println(r);
		}
		System.out.println("***********");
		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);
		}
	}
}
