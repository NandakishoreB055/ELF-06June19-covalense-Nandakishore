package com.covalense.java.methodreference;

import lombok.extern.java.Log;

@Log
public class TestRoom {
	static void open() {
		log.info("*****open method called*****");
		log.info("logic to open method");
	}

	public static void main(String[] args) {
		Room r = TestRoom::open;
		r.remove();

	}
}
