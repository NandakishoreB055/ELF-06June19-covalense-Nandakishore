package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArray9 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("nanda");
		al.add("kishore");
		al.add("priya");
		al.add("divya");

		ListIterator<String> lit = al.listIterator();
		while (lit.hasNext()) {
			String r = lit.next();
			System.out.println(r);
		}
		System.out.println("***********");
		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);
		}
	}

}
