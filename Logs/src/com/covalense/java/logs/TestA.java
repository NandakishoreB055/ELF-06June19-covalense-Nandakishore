package com.covalense.java.logs;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;

public class TestA {

	private static final Logger Loger = Logger.getLogger("flipkart");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		try {
			FileHandler fh = new FileHandler("flipkart.log", true);
			fh.setLevel(Level.WARNING);
			fh.setFormatter(new SimpleFormatter());
			Loger.addHandler(fh);

			Loger.log(Level.SEVERE, "SEVERE msg");
			Loger.log(Level.WARNING, "WARNING msg");
			Loger.log(Level.INFO, "INFO msg");
			Loger.log(Level.CONFIG, "CONFIG msg");
			Loger.log(Level.FINE, "FINE msg");
			Loger.log(Level.FINER, "FINER msg");
			Loger.log(Level.FINEST, "FINEST msg");

			buyProduct a = new buyProduct();
			a.buy();
			System.out.println("Done");
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}

	}
}
