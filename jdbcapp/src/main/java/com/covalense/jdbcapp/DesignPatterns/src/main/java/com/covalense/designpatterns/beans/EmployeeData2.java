package com.covalense.designpatterns.beans;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmployeeData2 implements Serializable {
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joiningDate;
	private long account_number;
	private String email;
	private String designation;
	private Date dob;
	private int dept_Id;
	private int mngrId;

	private EmployeeData2(EmployeeData2Builder builder) {
		id = builder.id;
		name = builder.name;
		age = builder.age;
		gender = builder.gender;
		salary = builder.salary;
		phone = builder.phone;
		joiningDate = builder.joiningDate;
		account_number = builder.account_number;
		email = builder.email;
		designation = builder.designation;
		dob = builder.dob;
		dept_Id = builder.dept_Id;
		mngrId = builder.mngrId;
	}

	public static class EmployeeData2Builder {
		private int id;
		private String name;
		private int age;
		private String gender;
		private double salary;
		private long phone;
		private Date joiningDate;
		private long account_number;
		private String email;
		private String designation;
		private Date dob;
		private int dept_Id;
		private int mngrId;

		public EmployeeData2Builder id(int id) {
			this.id = id;
			return this;
		}

		public EmployeeData2Builder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeData2Builder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeData2Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public EmployeeData2Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeData2Builder phone(long phone) {
			this.phone = phone;
			return this;
		}

		public EmployeeData2Builder joiningDate(Date joiningDate) {
			this.joiningDate = joiningDate;
			return this;
		}

		public EmployeeData2Builder account_number(long account_number) {
			this.account_number = account_number;
			return this;
		}

		public EmployeeData2Builder email(String email) {
			this.email = email;
			return this;
		}

		public EmployeeData2Builder designation(String designation) {
			this.designation = designation;
			return this;
		}

		public EmployeeData2Builder dob(Date dob) {
			this.dob = dob;
			return this;
		}

		public EmployeeData2Builder dept_Id() {
			this.dept_Id = dept_Id;
			return this;
		}

		public EmployeeData2Builder mngrId(int mngrId) {
			this.mngrId = mngrId;
			return this;
		}
		public EmployeeData2 build() {
			return new EmployeeData2(this);
		}

	}
}
