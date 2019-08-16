package com.covalense.springcore.beans.interfaces;
import lombok.extern.java.Log;

@Log
public class Monkey implements Animal {

	public void eat() {
		log.info("monkey eating");	
	}

	public void sound() {
		log.info("monkey sound");	
		
	}

}
