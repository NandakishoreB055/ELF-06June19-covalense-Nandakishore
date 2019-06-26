package com.covalense.java.fucntioninterface;

import java.util.function.Function;
import lombok.extern.java.Log;

@Log
public class TestFunctionInterface3 {
	public static void main(String[] args) {
		Function<String, Integer> str = s -> s.length();
		int x = str.apply("nanda");
		log.info("" + x);
	}

}
