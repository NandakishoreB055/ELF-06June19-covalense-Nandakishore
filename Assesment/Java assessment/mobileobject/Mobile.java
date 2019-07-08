package com.covalense.java.mobileobject;
/**
 * 
 * @author bean class
 *
 */
public class Mobile {
	private String brand;
	private int cost;

	Mobile() {

	}

	Mobile(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public int getCost() {
		return cost;
	}

}
