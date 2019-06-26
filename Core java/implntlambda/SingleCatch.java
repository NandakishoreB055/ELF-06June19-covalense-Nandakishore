package com.covalense.java.implntlambda;

import lombok.extern.java.Log;

@Log
public class SingleCatch {
	public static void main(String[] args) {
		try {
//logic
		} catch (ArithmeticException | NullPointerException e) {
			log.info(e.getMessage());
		} catch (Exception a) {
			log.info("general catch block");
		}

	}
}
