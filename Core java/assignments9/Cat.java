package com.covalense.java.assignments9;

import lombok.extern.java.Log;

@Log
public class Cat implements Animal {
	@Override
	public void sound() {
		log.info("mow mow");
	}

}
