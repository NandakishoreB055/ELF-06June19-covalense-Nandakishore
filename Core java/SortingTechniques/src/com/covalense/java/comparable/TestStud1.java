package com.covalense.java.comparable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStud1 {

	public static void main(String[] args) {
		ArrayList<Student1> al = new ArrayList<Student1>();
		Student1 s1 = new Student1();
		s1.name = "nanda";
		s1.id = 15;
		s1.percentage = 77.7;

		Student1 s2 = new Student1();
		s2.name = "kishore";
		s2.id = 10;
		s2.percentage = 79.7;

		Student1 s3 = new Student1();
		s3.name = "priya";
		s3.id = 11;
		s3.percentage = 70.7;

		Student1 s4 = new Student1();
		s4.name = "divya";
		s4.id = 10;
		s4.percentage = 72.7;

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		for (Object ss : al) {
			System.out.println(ss);
		}

		Iterator<Student1> it = al.iterator();
		while (it.hasNext()) {

			Student1 s = it.next();
			System.out.println("name is " + s.name);
			System.out.println("id is " + s.id);
			System.out.println("percentage is " + s.percentage);
		}

	}
}