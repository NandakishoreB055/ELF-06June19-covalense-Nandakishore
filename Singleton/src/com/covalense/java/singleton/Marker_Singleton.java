package com.covalense.java.singleton;

public class Marker_Singleton {
	private final static Marker_Singleton m = new Marker_Singleton();

	private Marker_Singleton() {

	}

	public static Marker_Singleton getmarker() {
		return m;
	}
}
