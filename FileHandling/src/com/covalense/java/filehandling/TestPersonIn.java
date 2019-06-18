package com.covalense.java.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestPersonIn {
	public static void main(String[] args) {
		PersonIn p = new PersonIn();
		p.setId(15);
		p.setName("nanda");
		FileOutputStream fout = null;
		ObjectOutputStream obj = null;
		try {
			fout = new FileOutputStream("nanda.txt");
			obj = new ObjectOutputStream(fout);
			obj.writeObject(p);
			obj.close();

			FileInputStream fin = new FileInputStream("nanda.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			PersonIn p1 = (PersonIn) objin.readObject();
			System.out.println("name is " + p1.getName());
			System.out.println("id is " + p1.getId());
			objin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
	}
}
