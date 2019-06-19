package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArray8 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("nanda");
		al.add("kishore");
		al.add("priya");
		al.add("divya");

		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String r = it.next();
			System.out.println(r);
		}
	}

}
