package com.covalense.java.arraysort;

import lombok.extern.java.Log;

interface Sum {
	int add(int a, int b);
}

@Log
public class LambdaTest {
	public static void main(String[] args) {
		Sum s = (a, b) -> a + b;
		int i = s.add(5, 6);
		log.info(" " + i);
	}
}