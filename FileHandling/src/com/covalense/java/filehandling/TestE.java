package com.covalense.java.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestE {

	public static void main(String[] args) {

		try {
			FileInputStream fi = new FileInputStream("myfile.txt");
			int i;
			while ((i = fi.read()) != -1) {
				System.out.print((char) i);
			}
			fi.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
