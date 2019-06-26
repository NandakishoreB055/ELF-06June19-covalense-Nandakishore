package com.covalense.java.multithread;

import lombok.extern.java.Log;

@Log
public class Pen1 extends Thread {
	@Override
	public void run() {
		String s = getName();
		log.info("" + s);
	}

}
