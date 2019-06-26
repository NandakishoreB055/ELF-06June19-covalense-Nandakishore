package com.covalense.java.implntlambda;

import lombok.extern.java.Log;

@Log
public class Marker {
	public static void main(String[] args) {
		Runnable x = () -> {
			for (int i = 0; i < 5; i++) {
				log.info("" + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(x);
		t.start();

	}

}
