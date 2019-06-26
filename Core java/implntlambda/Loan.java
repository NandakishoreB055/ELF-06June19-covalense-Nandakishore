package com.covalense.java.implntlambda;

public enum Loan {
	HOME(500), PERSONAL(501), CAR(502);
	private int value;

	private Loan(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
