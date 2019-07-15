package com.covalense.java.assignments6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Pro7 {

	public static void main(String[] args) {
		InputStream in1 = null;
		OutputStream out = null;
		InputStream in2 = null;

		File f1 = new File("src.txt");

		File f2 = new File("prog7.txt");
		File f3 = new File("ph.txt");

		try {
			in1 = new FileInputStream(f1);
			in2 = new FileInputStream(f3);
			out = new FileOutputStream(f2, true);
			byte[] b = new byte[1024];
			int length;
			while ((length = in1.read(b)) > 0) {
				out.write(b, 0, length);
			}
			while ((length = in2.read(b)) > 0) {
				out.write(b, 0, length);
			}

			if (in1 != null)
				in1.close();

			if (in2 != null)
				in2.close();
			if (out != null)
				out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
