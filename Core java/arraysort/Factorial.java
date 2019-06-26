package com.covalense.java.arraysort;

interface fact {
	int f(int a);
}

public class Factorial {
	public static void main(String[] args) {
		fact f = a -> {
			int k = 5;
			for (int i = 1; i <= a; i++) {
				k = (k + 1);
			}
			return k;
		};
	}
}
