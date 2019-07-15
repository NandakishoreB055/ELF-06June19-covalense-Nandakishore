package com.covalense.java.assignment8;

import java.util.ArrayList;
import java.util.Comparator;

public class ProgE {
	double getTopper(ArrayList<Student> al) {
		Comparator<Student> c=(i,j)->{
			Double a=i.marks;
			Double b=j.marks;
			
			return a.compareTo(b);
		};
		Student minValue= al.stream().max(c).get();
		return minValue.marks;
		
		

	}
	
	Student getPoper(ArrayList<Student> al) {
		Comparator<Student> c=(i,j)->{
			Double a=i.marks;
			Double b=j.marks;
			
			return a.compareTo(b);
		};
		Student minValue= al.stream().min(c).get();
		return minValue;
		
		
	}
	
}