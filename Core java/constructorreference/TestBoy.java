package com.covalense.java.constructorreference;

import lombok.extern.java.Log;

@Log
public class TestBoy {

	public static void main(String[] args) {
		MyBoy mb = Boy::new;
		Boy b = mb.getBoy("nanda", 5.8, 22);
		log.info("name is " + b.name);
		log.info("height is " + b.height);
		log.info("age is " + b.age);
	}
}
