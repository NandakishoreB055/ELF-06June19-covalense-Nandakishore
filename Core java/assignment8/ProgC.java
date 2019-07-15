package com.covalense.java.assignment8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class ProgC {
	public static void main(String[] args) {
		
		try {
			FileOutputStream f=new FileOutputStream("personal.properties");
			Properties p= new Properties();
			p.setProperty("name", "kishore");
			p.setProperty("phoneNumber", "34664565");
			p.store(f, "personal details");
			log.info("done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
