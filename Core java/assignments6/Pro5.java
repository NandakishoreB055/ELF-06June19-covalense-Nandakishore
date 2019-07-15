package com.covalense.java.assignments6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public class Pro5 {

	private static final Logger log = Logger.getLogger("Nanda");

	public static void main(String[] args) {
		InputStream in = null;

		File f1 = new File("src.csv");

		try {
			in = new FileInputStream(f1);
			int i;
			while ((i = in.read()) != -1) {
				log.info("" + (char) i);
			}
			if (in != null)
				in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
