package com.covalense.java.assignments9;

import lombok.extern.java.Log;

@Log
public class StudentCustomException extends Exception {

	public void validateExamCriteria(double attendencePer) {
		if (attendencePer < 70) {
			try {
				throw new StudentCustomException();
			} catch (StudentCustomException e) {
				log.info("Not eligible for Exam");
			}
		}
	}
}
