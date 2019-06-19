package com.covalense.java.logs;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;

public class amazonloger {
	private static final Logger Loger = Logger.getLogger("amazon");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		try {
			FileHandler f = new FileHandler("amazon.log");
			f.setLevel(Level.CONFIG);
			f.setFormatter(new SimpleFormatter());
			Loger.addHandler(f);

			Loger.log(Level.SEVERE, "SEVERE msg");
			Loger.log(Level.WARNING, "WARNING msg");
			Loger.log(Level.INFO, "INFO msg");
			Loger.log(Level.CONFIG, "CONFIG msg");
			Loger.log(Level.FINE, "FINE msg");
			Loger.log(Level.FINER, "FINER msg");
			Loger.log(Level.FINEST, "FINEST msg");

			register a = new register();
			a.connectdb();
			a.store();
			System.out.println("Done");
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}

	}

}
