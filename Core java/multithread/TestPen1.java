package com.covalense.java.multithread;

import lombok.extern.java.Log;

@Log
public class TestPen1 {

	public static void main(String[] args) {
		log.info("main started");
		Pen1 t1 = new Pen1();
		t1.setName("kishore");
		t1.start();

		log.info("main ended");
	}

}
