package com.covalense.java.fucntioninterface;

import java.util.function.Function;
import lombok.extern.java.Log;

@Log
public class TestFunctionInterface2 {
	public static void main(String[] args) {
		Function<Integer, Integer> f = r -> r * r;
		int x = f.apply(5);
		log.info("" + x);
	}
}
