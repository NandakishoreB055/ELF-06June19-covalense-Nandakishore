package com.covalense.java.comparable;
import java.util.TreeSet;

public class TestProduct {

	public static void main(String[] args) {
		TreeSet<Product> t = new TreeSet<Product>();
		Product p1 = new Product();
		p1.name = "a1";
		p1.cost = 200;
		p1.rate = 3.4;

		Product p2 = new Product();
		p2.name = "a2";
		p2.cost = 300;
		p2.rate = 3.9;

		Product p3 = new Product();
		p3.name = "a3";
		p3.cost = 300;
		p3.rate = 4.4;

		Product p4 = new Product();
		p4.name = "a4";
		p4.cost = 400;
		p4.rate = 4.9;

		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);

		for (Product pp : t) {
			System.out.println("name is " + pp.name);
			System.out.println("cost is " + pp.cost);
			System.out.println("rate is " + pp.rate);
			System.out.println("***************");
		}
	}

}
