package com.covalense.java.implntlambda;

import lombok.extern.java.Log;

@Log
public class TestLoan {

	public static void main(String[] args) {
		Loan l = Loan.PERSONAL;
		int constvalue = l.getValue();
		log.info("personal value is " + constvalue);
	}

}
                                 