package com.covalense.java.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class FileEx {

	public static void main(String[] args) {
		try {
			/*
			 * FileUtils.writeStringToFile(new File("myfile.txt"), "this is a text file2",
			 * Charset.defaultCharset()); System.out.println("created");
			 */
			System.out.println("reading the file");
			String fileData = FileUtils.readFileToString(new File("myfile.txt"));
			System.out.println("file data is--->" + fileData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
