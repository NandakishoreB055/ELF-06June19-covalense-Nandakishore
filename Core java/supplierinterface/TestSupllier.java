package com.covalense.java.supplierinterface;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class TestSupllier {

	public static void main(String[] args) {
		Supplier<Gun> v = () -> new Gun(100);
		Gun g = v.get();
		log.info("" + g.bullets);
	}

}
