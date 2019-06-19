package com.covalense.java.logs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class register {
	private static final Logger Loger = Logger.getLogger("amazon");

	void connectdb() {
		Loger.log(Level.INFO, "dbconnected");
	}

	void store() {
		Logger Loger = Logger.getLogger("amazon");
		Loger.log(Level.INFO, "stored");
	}
}
