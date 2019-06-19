package com.covalense.java.collections;

import java.util.ArrayList;

public class TestArray1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add("Kishore");
		al.add('a');
		al.add(99.9);
		al.add('w');
		al.add('q');
		for (int i = 0; i < al.size(); i++) {
			Object r = al.get(i);
			System.out.println(r);
		}

	}

}
