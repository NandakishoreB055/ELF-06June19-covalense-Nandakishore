package com.covalense.java.tryresource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import lombok.extern.java.Log;

@Log
public class WriteStream {
	public static void main(String[] args) {
		String msg = "hi how are you";
		byte b[] = msg.getBytes();

		try (FileOutputStream fout = new FileOutputStream("myfile.txt");) {
			fout.write(b);
			log.info("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
