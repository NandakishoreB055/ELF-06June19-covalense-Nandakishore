package com.covalense.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TestD {

	public static void main(String[] args) {
		String msg = "hi  how are you";
		char c[] = msg.toCharArray();

		try {
			FileWriter fw = new FileWriter("hi.txt");
			fw.write(c);
			fw.flush();
			fw.flush();
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
