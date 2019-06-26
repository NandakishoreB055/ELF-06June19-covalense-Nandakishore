package com.covalense.java.fucntioninterface;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class TestFunctionInterface1 {

	public static void main(String[] args) {
		Function<Double, Double> f = r -> 3.142 * r * r;
		double x = f.apply(5.6);
		log.info("" + x);
	}

}
