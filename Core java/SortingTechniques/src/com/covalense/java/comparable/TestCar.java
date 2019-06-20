package com.covalense.java.comparable;
import java.util.TreeSet;

public class TestCar {

	public static void main(String[] args) {
		TreeSet<Car> t = new TreeSet<Car>();
		Car p1 = new Car();
		p1.name = "a";
		p1.cost = 200000;
		p1.rate = 3.4;
		p1.brand = "audi";

		Car p2 = new Car();
		p2.name = "indica";
		p2.cost = 10000;
		p2.rate = 3.9;
		p2.brand = "tata";

		Car p3 = new Car();
		p3.name = "chiron";
		p3.cost = 3000000;
		p3.rate = 4.9;
		p3.brand = "bugatti";

		Car p4 = new Car();
		p4.name = "g";
		p4.cost = 400;
		p4.rate = 4.0;
		p4.brand = "benz";

		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);

		for (Car c : t) {
			System.out.println("name is " + c.name);
			System.out.println("cost is " + c.cost);
			System.out.println("rate is " + c.rate);
			System.out.println("brand is " + c.brand);
			System.out.println("******************");
		}
	}

}
