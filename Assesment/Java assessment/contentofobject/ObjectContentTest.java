package com.covalense.java.contentofobject;

import java.util.ArrayList;
import java.util.stream.Stream;
import lombok.extern.java.Log;

@Log
/**
 * 
 * @author program to display the content of the object
 *
 */
public class ObjectContentTest {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add(10.9);
		al.add(11.9);
		al.add(20);

		// Get the stream
		Stream<String> stream = Stream.of("nanda", "kishore", "anand", "A", "Computer", "science");

		// Print the stream
		stream.forEach(s -> log.info("" + s));
	}

}
