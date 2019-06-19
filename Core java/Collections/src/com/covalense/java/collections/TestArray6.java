package com.covalense.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArray6 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(33);
		al.add(100);
		al.add(16);

		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
			System.out.println(r);
		}
	}
}
