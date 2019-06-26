package com.covalense.java.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMouse {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("first task");
		Mouse m2 = new Mouse("second task");
		Mouse m3 = new Mouse("third task");
		Mouse m4 = new Mouse("fourth task");
		Mouse m5 = new Mouse("fifth task");

		ExecutorService service = Executors.newFixedThreadPool(2);

		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);

		service.shutdown();
	}

}
