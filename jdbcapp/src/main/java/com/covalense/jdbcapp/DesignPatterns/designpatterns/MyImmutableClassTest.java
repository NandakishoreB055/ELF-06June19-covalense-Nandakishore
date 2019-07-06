package com.covalense.designpatterns;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) {
		MyImmutableClass immutableClass = null;
		immutableClass = new MyImmutableClass("abc", 20, 572366757);
		
		log.info("Name: " + immutableClass.getName());
		log.info("Age: " + immutableClass.getAge());
		log.info("Phone : " + immutableClass.getPhone());
		
		immutableClass = new MyImmutableClass("xyz", 10, 236478658);
		log.info("Name: " + immutableClass.getName());
		log.info("Age: " + immutableClass.getAge());
		log.info("Phone : " + immutableClass.getPhone());
	}
}
