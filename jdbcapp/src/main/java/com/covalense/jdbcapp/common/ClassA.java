package com.covalense.jdbcapp.common;

import lombok.extern.java.Log;

@Log
public class ClassA implements Connection {

	@Override
	public void print() {
		log.info("aaaa");
	}

}
