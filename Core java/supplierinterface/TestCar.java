package com.covalense.java.supplierinterface;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class TestCar {

	public static void main(String[] args) {
		Supplier<Car> v = () -> new Car(100);
		Car g = v.get();
		log.info("" + g.fuel);
	}
}
