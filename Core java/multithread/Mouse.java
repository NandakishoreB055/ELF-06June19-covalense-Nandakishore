package com.covalense.java.multithread;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {
	String name;

	public Mouse(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			log.info(name + "  " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
