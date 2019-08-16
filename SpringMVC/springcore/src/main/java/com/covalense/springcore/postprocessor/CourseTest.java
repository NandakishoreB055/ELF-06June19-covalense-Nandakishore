package com.covalense.springcore.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class CourseTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("course.xml");
		CourseBean courseBean = (CourseBean) applicationContext.getBean("coursebean");
		log.info("CourseName :" + courseBean.getCourseName());
		log.info("CourseId :" + courseBean.getCourseId());
		log.info("Faculty :" + courseBean.getFaculty());
	}

}
