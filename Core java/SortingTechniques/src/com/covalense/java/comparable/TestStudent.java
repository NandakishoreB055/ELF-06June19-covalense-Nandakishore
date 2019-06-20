package com.covalense.java.comparable;
import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		Student s1 = new Student();
		s1.name = "nanda";
		s1.id = 15;
		s1.percentage = 77.7;

		Student s2 = new Student();
		s2.name = "kishore";
		s2.id = 10;
		s2.percentage = 79.7;

		Student s3 = new Student();
		s3.name = "priya";
		s3.id = 11;
		s3.percentage = 70.7;

		Student s4 = new Student();
		s4.name = "divya";
		s4.id = 10;
		s4.percentage = 72.7;

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		for (int i = 0; i < al.size(); i++) {
			Student s = (Student) al.get(i);
			System.out.println("name is " + s.name);
			System.out.println("id is " + s.id);
			System.out.println("percentage is " + s.percentage);

		}
	}

}
