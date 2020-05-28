package com.learning.creational.builder;

import com.learning.creational.builder.model.Loan;
import com.learning.creational.builder.model.LoanType;

public class BuilderMain {

	public static void main(String[] args) {

	
		LoanDirector loanDirector = new LoanDirector();
		Loan loan = loanDirector.ceateLoan(LoanProcessingFactory.getLoanBuilder(LoanType.HOME.name()));
		System.out.println(loan.toString());

		LoanDirector loanDirector1 = new LoanDirector();
		Loan loan1 = loanDirector1.ceateLoan(LoanProcessingFactory.getLoanBuilder(LoanType.VEHICLE.name()));
		System.out.println(loan1.toString());

	}

}
