package com.covalense.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestC {

	public static void main(String[] args) {
		String msg = "hi how are you";
		byte b[] = msg.getBytes();

		try {
			FileOutputStream fout = new FileOutputStream("myfile.txt");
			fout.write(b);
			fout.close();
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
