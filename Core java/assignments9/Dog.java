package com.covalense.java.assignments9;

import lombok.extern.java.Log;

@Log
public class Dog implements Animal {

	@Override
	public void sound() {
		log.info("Bow bow");
	}

}
