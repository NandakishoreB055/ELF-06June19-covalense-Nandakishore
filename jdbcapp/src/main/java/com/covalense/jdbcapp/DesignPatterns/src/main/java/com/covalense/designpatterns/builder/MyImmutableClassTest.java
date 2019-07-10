package com.covalense.designpatterns.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.designpatterns.beans.EmployeeData2;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) throws ParseException {
		MyImmutableClass immutableClass = null;
		immutableClass = new MyImmutableClass("abc", 20, 572366757);

		log.info("Name: " + immutableClass.getName());
		log.info("Age: " + immutableClass.getAge());
		log.info("Phone : " + immutableClass.getPhone());

		immutableClass = new MyImmutableClass("xyz", 10, 236478658);
		log.info("Name: " + immutableClass.getName());
		log.info("Age: " + immutableClass.getAge());
		log.info("Phone : " + immutableClass.getPhone());

		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date=format.parse("2012-09-08");
		
		EmployeeData2 data = new EmployeeData2(101, "nanda", 22, "male", 15000.5, 48268448, date, 488464, "n@gmail.com",
				"developer", date, 1, 200);
		log.info("Data" + data.toString());
		
		
		EmployeeData2 data2=new EmployeeData2
				                .EmployeeData2Builder()
				                .name("kishore")
				                .id(102)
				                .age(22)
				                .gender("male")
				                .salary(20000.90)
		                        .phone(875634)
		                        .joiningDate(date)
		                        .account_number(75827)
		                        .email("k@gmail.com")
		                        .designation("software engg")
		                        .dob(date)
		                        .mngrId(456)
		                        .dept_Id()
		                        .build();
				                
			   log.info("Employee Data 2" + data2.toString());  
			   
			   com.covalense.designpatterns.builder.EmployeeData3 data3=new EmployeeData3.EmployeeData3Builder()
		                .name("kishore")
		                .id(102)
		                .age(22)
		                .gender("male")
		                .salary(20000.90)
                       .phone(875634)
                       .joiningDate(date)
                       .account_number(75827)
                       .email("k@gmail.com")
                       .designation("software engg")
                       .dob(date)
                       .mngrId(456)
                       .dept_Id(1)
                       .build();
		                
	   log.info("Employee Data 3" + data3.toString());   
		                        
	}
}
