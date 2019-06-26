package com.covalense.java.implntlambda;

import lombok.extern.java.Log;

@Log
public class TestGender {

	public static void main(String[] args) {
		log.info("" + Gender.MALE.ordinal());
		log.info("" + Gender.FEMALE);
	}

}
