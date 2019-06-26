package com.covalense.java.constructorreference;
import lombok.extern.java.Log;

@Log
public class TestProduct {

	public static void main(String[] args) {
		MyProduct mp = Product::new;
		Product p = mp.getProduct("samsung", 220000);
		log.info("name is " + p.name);
		log.info("Price is " + p.price);
	}

}
