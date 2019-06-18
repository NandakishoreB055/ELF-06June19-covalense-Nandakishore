package com.covalense.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestPersonIn2 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("nanda");
		p.setId(15);
		FileOutputStream fout = null;
		ObjectOutputStream obj = null;

		try {
			fout = new FileOutputStream("nanda.txt");
			obj = new ObjectOutputStream(fout);
			obj.writeObject(p);
			obj.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fout != null)
				try {
					obj.close();
				} catch (IOException e) {
					e.printStackTrace();

				}
		}
	}
}
