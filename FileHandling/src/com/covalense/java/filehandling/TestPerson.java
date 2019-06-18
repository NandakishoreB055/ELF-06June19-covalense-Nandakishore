package com.covalense.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("nanda");
		p.setId(15);
		try {

			FileOutputStream fout = new FileOutputStream("nanda.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(p);
			obj.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
