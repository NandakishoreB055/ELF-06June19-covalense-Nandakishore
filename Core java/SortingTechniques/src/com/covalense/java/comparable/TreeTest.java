package com.covalense.java.comparable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeTest {

	public static void main(String[] args) {
		TreeSet<TreeStudent> ts = new TreeSet<TreeStudent>();
		TreeStudent s1 = new TreeStudent();
		s1.name = "nanda";
		s1.id = 15;
		s1.percentage = 77.7;

		TreeStudent s2 = new TreeStudent();
		s2.name = "kishore";
		s2.id = 10;
		s2.percentage = 79.7;

		TreeStudent s3 = new TreeStudent();
		s3.name = "priya";
		s3.id = 11;
		s3.percentage = 70.7;

		TreeStudent s4 = new TreeStudent();
		s4.name = "divya";
		s4.id = 10;
		s4.percentage = 72.7;

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);

		int i;

		for (Object ss : ts) {
			System.out.println(ss);
		}

		Iterator<TreeStudent> it = ts.iterator();
		while (it.hasNext()) {
			TreeStudent s = it.next();
			System.out.println("name is " + s.name);
			System.out.println("id is " + s.id);
			System.out.println("percentage is " + s.percentage);
		}

	}

}
