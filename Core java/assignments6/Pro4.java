package com.covalense.java.assignments6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Pro4 {

	public static void main(String[] args) {

		FileOutputStream fout = null;
		ObjectOutputStream obj = null;
		try {
			Employ e = new Employ();
			e.set("Nanda", 20, "IT", 20000);
			fout = new FileOutputStream("prog4.csv");
			obj = new ObjectOutputStream(fout);
			obj.writeObject(e);
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (fout != null)
					fout.close();
				if (obj != null)
					obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
