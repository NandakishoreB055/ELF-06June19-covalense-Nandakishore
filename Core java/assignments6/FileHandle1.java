package com.covalense.java.assignments6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle1 {

	public static void main(String[] args) {
		File file = new File("emp");
		try {
			FileWriter ofile = new FileWriter(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
