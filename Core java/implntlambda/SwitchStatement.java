package com.covalense.java.implntlambda;

import lombok.extern.java.Log;

@Log
public class SwitchStatement {

	public static void main(String[] args) {
		String s = "apple";
		switch (s) {
		case "apple":
			log.info("Hi apple");
			break;
		case "cat":
			log.info("Hi cat");
			break;
		case "rat":
			log.info("Hi rat");
			break;
		default:
			log.info("oops..its default");
			
		}
	}

}
