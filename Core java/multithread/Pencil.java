package com.covalense.java.multithread;

import java.util.concurrent.Callable;
import lombok.extern.java.Log;

@Log
public class Pencil implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {

		return 120;
	}

}
