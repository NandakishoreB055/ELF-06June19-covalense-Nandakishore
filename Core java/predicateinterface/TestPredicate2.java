package com.covalense.java.predicateinterface;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class TestPredicate2 {

	public static void main(String[] args) {
		Predicate<String> str = s -> s.length() >= 5;
		boolean x = str.test("nanda");
		log.info("" + x);
	}

}
