package com.covalense.java.supplierinterface;

public class Car {
	int fuel;

	Car(int i) {
		fuel = i;
	}

	Car getfuel() {
		return new Car(50);
	}
}
