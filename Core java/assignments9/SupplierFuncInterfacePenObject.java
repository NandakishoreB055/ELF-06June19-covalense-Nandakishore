package com.covalense.java.assignments9;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class SupplierFuncInterfacePenObject {

	public static void main(String[] args) {
		Supplier<Pen> s = () -> new Pen();

		log.info("" + s.get().getClass());
	}

}
